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
import tec.bd.blockbuster.dao.PrestamoDao;
import tec.bd.blockbuster.movie;
import tec.bd.blockbuster.rentals;

public class PrestamoDaoImpl extends GenericMysqlDaoImpl<rentals, Long> implements PrestamoDao {

    private static final String SQL_FIND_ALL_PRESTAMO = "select id, rental_date, client_id, movie_id from rentals";
    private static final String SQL_FIND_BY_ID_PRESTAMO = "select id, rental_date, client_id, movie_id from rentals where id = ?";
    private static final String SQL_FIND_BY_TITLE = "select id, rental_date, client_id, movie_id from rentals where rental_date like ?";
    private static final String SQL_INSERT_PRESTAMO = "insert into rentals(rental_date, client_id, movie_id) values (?, ?, ?)";

    private static final String PROC_DELETE_PRESTAMO = "{call delete_rentals(?)}";

    private final DataSource dataSource;

    public PrestamoDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<rentals> findAll() {
        List<rentals> rentals = new ArrayList<>();
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            var stmt = dbConnection.prepareStatement(SQL_FIND_ALL_PRESTAMO);
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
        return rentals;
    }

    @Override
    public Optional<rentals> findById(Long rentalId) {
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            var stmt = dbConnection.prepareStatement(SQL_FIND_BY_ID_PRESTAMO);
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
    public Optional<rentals> findByTitle(String title) {
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
    public void save(rentals rental) {
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            PreparedStatement insertMovie = dbConnection.prepareStatement(SQL_INSERT_PRESTAMO);
            insertMovie.setInt(1, rental.getClient_id());
            var releaseDate = new java.sql.Date(rental.getRental_date().getTime());
            insertMovie.setInt(1, rental.getMovie_id());
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
    public void delete(Long rentalId) {
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            CallableStatement stmt = dbConnection.prepareCall(PROC_DELETE_PRESTAMO);
            stmt.setLong(1, rentalId);
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(); // no recomendado

            throw new RuntimeException("Can't delete movie id " + rentalId, e);
        }
    }

    @Override
    public Optional<rentals> update(rentals rental) {
        return null;
    }

    @Override
    protected rentals resultSetToEntity(ResultSet resultSet) throws SQLException {
        var rentalId = resultSet.getInt("id");
        var rental_date = resultSet.getString("rental_date");
        var client_id = resultSet.getDate("client_id");
        var movie_id = resultSet.getString("movie_id");
        //var movie = new movie(movieId, title, new Date(releaseDate.getTime()), category);
        //return movie;
        return null;
    }

    @Override
    protected List<rentals> resultSetToList(ResultSet resultSet) throws SQLException {
        List<rentals> rental = new ArrayList<>();
        while(resultSet.next()) {
            rental.add(resultSetToEntity(resultSet));
        }
        return rental;
    }


}