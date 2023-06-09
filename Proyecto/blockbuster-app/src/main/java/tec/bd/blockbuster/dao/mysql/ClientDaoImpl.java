/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.dao.mysql;


import javax.sql.DataSource;
import java.sql.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import tec.bd.blockbuster.dao.MovieDao;
import tec.bd.blockbuster.movie;

public class ClientDaoImpl extends GenericMysqlDaoImpl<movie, Long> implements MovieDao {

    private static final String SQL_FIND_ALL_CLIENT = "select id, nombre, apellido, cedula, telefono, direccion from clients";
    private static final String SQL_FIND_BY_ID_CLIENT = "select id, nombre, apellido, cedula,telefono, direccion from clients where id = ?";
    private static final String SQL_FIND_BY_TITLE = "select id, nombre, apellido, cedula, telefono, direccion from clients where nombre like ?";
    private static final String SQL_INSERT_CLIENT = "insert into clients(nombre, apellido, cedula, telefono, direccion) values (?, ?, ?, ?, ?)";

    private static final String PROC_DELETE_CLIENT = "{call delete_clients(?)}";

    private final DataSource dataSource;

    public ClientDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<movie> findAll() {
        List<movie> movies = new ArrayList<>();
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            var stmt = dbConnection.prepareStatement(SQL_FIND_ALL_CLIENT);
            var resultSet = stmt.executeQuery();
            return resultSetToList(resultSet);
        } catch (Exception e) {
            try {
                System.out.println(e.getMessage());
                dbConnection.rollback();
            } catch (SQLException sqlEx) {
                throw new RuntimeException(sqlEx);
            }
        }
        return movies;
    }

    @Override
    public Optional<movie> findById(Long movieId) {
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            var stmt = dbConnection.prepareStatement(SQL_FIND_BY_ID_CLIENT);
            stmt.setInt(1, 1);
            var resultSet = stmt.executeQuery();
            if(resultSet.next()) {
                return Optional.of(resultSetToEntity(resultSet));
            }
        } catch (Exception e) {
            try {
                System.out.println(e.getMessage());
                dbConnection.rollback();
            } catch (SQLException sqlEx) {
                throw new RuntimeException(sqlEx);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<movie> findByTitle(String title) {
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            var stmt = dbConnection.prepareStatement(SQL_FIND_BY_TITLE);
            stmt.setString(1, title );
            var resultSet = stmt.executeQuery();
            if(resultSet.next()) {
                return Optional.of(resultSetToEntity(resultSet));
            }
        } catch (Exception e) {
            try {
                System.out.println(e.getMessage());
                dbConnection.rollback();
            } catch (SQLException sqlEx) {
                throw new RuntimeException(sqlEx);
            }
        }
        return Optional.empty();
    }

    @Override
    public void save(movie movie) {
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            PreparedStatement insertMovie = dbConnection.prepareStatement(SQL_INSERT_CLIENT);
            insertMovie.setString(1, movie.getTitulo());
            var releaseDate = new java.sql.Date(movie.getFecha_lanzamiento().getTime());
            insertMovie.setDate(2, releaseDate);
            //insertMovie.setString(3, movie.getCategory());
            insertMovie.executeUpdate();
        } catch (Exception e) {
            try {
                dbConnection.rollback();
            } catch (SQLException sqlEx) {
                throw new RuntimeException(sqlEx);
            }
        }
    }

    @Override
    public void delete(Long movieId) {
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            CallableStatement stmt = dbConnection.prepareCall(PROC_DELETE_CLIENT);
            stmt.setLong(1, movieId);
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(); // no recomendado

            throw new RuntimeException("Can't delete movie id " + movieId, e);
        }
    }

    @Override
    public Optional<movie> update(movie movie) {
        return null;
    }

    @Override
    protected movie resultSetToEntity(ResultSet resultSet) throws SQLException {
        var movieId = resultSet.getInt("Id");
        var title = resultSet.getString("titulo");
        var releaseDate = resultSet.getDate("fecha_lanzamiento");
        var category = resultSet.getString("category_id");
        var units_available = resultSet.getString("unidades disponibles");
        //var movie = new movie(movieId, title, new Date(releaseDate.getTime()), category);
        //return movie;
        return null;
    }

    @Override
    protected List<movie> resultSetToList(ResultSet resultSet) throws SQLException {
        List<movie> movies = new ArrayList<>();
        while(resultSet.next()) {
            movies.add(resultSetToEntity(resultSet));
        }
        return movies;
    }


}