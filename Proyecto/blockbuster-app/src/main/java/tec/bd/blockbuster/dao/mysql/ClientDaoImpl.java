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
import tec.bd.blockbuster.clients;
import tec.bd.blockbuster.dao.ClientDao;
import tec.bd.blockbuster.dao.MovieDao;
import tec.bd.blockbuster.movie;

public class ClientDaoImpl extends GenericMysqlDaoImpl<clients, Long> implements ClientDao {

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
    public List<clients> findAll() {
        List<clients> clients = new ArrayList<>();
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
        return clients;
    }

    @Override
    public Optional<clients> findById(Long clientId) {
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
    public Optional<clients> findByTitle(String client) {
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            var stmt = dbConnection.prepareStatement(SQL_FIND_BY_TITLE);
            stmt.setString(1, client );
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
    public void save(clients client) {
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            PreparedStatement insertClient = dbConnection.prepareStatement(SQL_INSERT_CLIENT);
            insertClient.setString(1, client.getNombre());
            insertClient.setString(1, client.getApellido());
            insertClient.setString(1, client.getDireccion());
            //var releaseDate = new java.sql.Date(movie.getFecha_lanzamiento().getTime());
            //insertMovie.setDate(2, releaseDate);
            //insertMovie.setString(3, movie.getCategory());
            insertClient.executeUpdate();
        } catch (Exception e) {
            try {
                dbConnection.rollback();
            } catch (SQLException sqlEx) {
                throw new RuntimeException(sqlEx);
            }
        }
    }

    @Override
    public void delete(Long clientId) {
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            CallableStatement stmt = dbConnection.prepareCall(PROC_DELETE_CLIENT);
            stmt.setLong(1, clientId);
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(); // no recomendado

            throw new RuntimeException("Can't delete movie id " + clientId, e);
        }
    }

    @Override
    public Optional<clients> update(clients client) {
        return null;
    }

    @Override
    protected clients resultSetToEntity(ResultSet resultSet) throws SQLException {
        var clientId = resultSet.getInt("id");
        var nombre = resultSet.getString("nombre");
        var apellido = resultSet.getString("apellido");
        var cedula = resultSet.getInt("cedula");
        var telefono = resultSet.getInt("telefono");
        var direccion = resultSet.getString("direccion");
        //var movie = new movie(movieId, title, new Date(releaseDate.getTime()), category);
        //return movie;
        return null;
    }

    @Override
    protected List<clients> resultSetToList(ResultSet resultSet) throws SQLException {
        List<clients> clients = new ArrayList<>();
        while(resultSet.next()) {
            clients.add(resultSetToEntity(resultSet));
        }
        return clients;
    }


}