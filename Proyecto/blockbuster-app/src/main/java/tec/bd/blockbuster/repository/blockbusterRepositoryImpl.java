/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import tec.bd.blockbuster.Category;
import tec.bd.blockbuster.movie;
import java.sql.Connection;
import javax.sql.DataSource;

/**
 *
 * @author pc
 */
public class blockbusterRepositoryImpl implements blockbusterRepository {
    private DataSource datasource;
    
    public blockbusterRepositoryImpl(DataSource datasource){
        this.datasource = datasource;
    }

    @Override
    public List<movie> findAll() {
        try{
        var connection = this.datasource.getConnection();
        Statement statement = connection.createStatement();
        String query = "select id, titulo, fecha_lanzamiento from movie order by id desc";
        ResultSet resultSet = statement.executeQuery(query);
        List<movie> entities = new ArrayList<>();
        while(resultSet.next()){
            Category category = new Category();
            movie movie = new movie();
            
            category.setId(resultSet.getInt("category_id"));
            category.setName(resultSet.getString("category_id"));
            
            movie.setId(resultSet.getInt("id"));
            movie.setTitulo(resultSet.getString("titulo"));
            
            movie.setCategory(category);
            entities.add(movie);
        }
        return entities;
        }catch(Exception e){
            throw new RuntimeException("No se encontró la base de datos", e);
            
        }
    }

    @Override
    public Optional<movie> findById(int id) {
        Connection dbConnection = null;
        try {
            dbConnection = this.datasource.getConnection();
            String SQL_FIND_BY_ID_MOVIE = null;
            var stmt = dbConnection.prepareStatement(SQL_FIND_BY_ID_MOVIE);
            stmt.setInt(1, 1);
            var resultSet = stmt.executeQuery();
            if(resultSet.next()) {
                //return Optional.of(resultSetToEntity(resultSet));
            }
        } catch (SQLException e) {
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
        try{
        String query = "insert into movie(titulo, category_id) values (?, ?)";
        var connection = this.datasource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query, 0);
        preparedStatement.setString(1, movie.getTitulo());
        //preparedStatement.setInt(1, movie.getCategory().getId());
        var rowsAffected = preparedStatement.executeUpdate();
        System.out.println("Rows Affected"+ rowsAffected);
        var resultSet = preparedStatement.getGeneratedKeys();
       
        while(resultSet.next()){
            var lastInsertedId = resultSet.getInt(1);
            movie newMovie = new movie();
            newMovie.setId(lastInsertedId);
            newMovie.setTitulo(movie.getTitulo());
            newMovie.setCategory(movie.getCategory());
           
        }
     
        }catch(Exception e){
            throw new RuntimeException("No se pudieron insertar los datos", e);
            
        }

    }
    
}
