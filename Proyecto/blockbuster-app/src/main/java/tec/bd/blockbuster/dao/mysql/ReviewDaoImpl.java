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
import tec.bd.blockbuster.dao.ReviewDao;
import tec.bd.blockbuster.movie;
import tec.bd.blockbuster.review;

public class ReviewDaoImpl extends GenericMysqlDaoImpl<review, Long> implements ReviewDao {

    private static final String SQL_FIND_ALL_REVIEW = "select id, rating, review_text, created_on, client_id, movie_id from review";
    private static final String SQL_FIND_BY_ID_REVIEW = "select id, rating, review_text, created_on, client_id from review where id = ?";
    private static final String SQL_FIND_BY_TITLE = "select id, rating, review_text, created_on, client_id from review where rating like ?";
    private static final String SQL_INSERT_REVIEW = "insert into review(rating, review_text, created_on, client_id) values (?, ?, ?, ?)";

    private static final String PROC_DELETE_REVIEW = "{call delete_reviews(?)}";

    private final DataSource dataSource;

    public ReviewDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<review> findAll() {
        List<review> review = new ArrayList<>();
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            var stmt = dbConnection.prepareStatement(SQL_FIND_ALL_REVIEW);
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
        return review;
    }

    @Override
    public Optional<review> findById(Long reviewId) {
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            var stmt = dbConnection.prepareStatement(SQL_FIND_BY_ID_REVIEW);
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
    public Optional<review> findByTitle(String title) {
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
    public void save(review review) {
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            PreparedStatement insertMovie = dbConnection.prepareStatement(SQL_INSERT_REVIEW);
            insertMovie.setInt(1, review.getRating());
            insertMovie.setString(1, review.getReview_text());
            var releaseDate = new java.sql.Date(review.getCreated_on().getTime());
            insertMovie.setInt(1, review.getClient_id());
            insertMovie.setInt(1, review.getMovie_id());
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
    public void delete(Long reviewId) {
        Connection dbConnection = null;
        try {
            dbConnection = this.dataSource.getConnection();
            CallableStatement stmt = dbConnection.prepareCall(PROC_DELETE_REVIEW);
            stmt.setLong(1, reviewId);
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(); // no recomendado

            throw new RuntimeException("Can't delete movie id " + reviewId, e);
        }
    }

    @Override
    public Optional<review> update(review review) {
        return null;
    }

    @Override
    protected review resultSetToEntity(ResultSet resultSet) throws SQLException {
        var reviewId = resultSet.getInt("id");
        var rating = resultSet.getInt("rating");
        var review_text = resultSet.getString("review_text");
        var created_on = resultSet.getDate("created_om");
        var client_id = resultSet.getInt("category_id");
        var movie_id = resultSet.getInt("unidades disponibles");
        //var movie = new movie(movieId, title, new Date(releaseDate.getTime()), category);
        //return movie;
        return null;
    }

    @Override
    protected List<review> resultSetToList(ResultSet resultSet) throws SQLException {
        List<review> review = new ArrayList<>();
        while(resultSet.next()) {
            review.add(resultSetToEntity(resultSet));
        }
        return review;
    }


}
