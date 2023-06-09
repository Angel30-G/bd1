/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster;

import java.util.List;
import java.util.Optional;
import tec.bd.blockbuster.Category;
import tec.bd.blockbuster.movie;
import tec.bd.blockbuster.repository.blockbusterRepository;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
//import tec.bd.blockbuster.dao.MovieDAO;
//import tec.bd.blockbuster.dao.inmemorylist.InMemoryMovieListDB;
//import tec.bd.blockbuster.dao.mysql.MovieDAOImpl;

import javax.sql.DataSource;
/**
 *
 * @author pc
 */
public class ApplicationContext {
  /*  
    //1 configurar Hikari
    HikariConfig hikariConfig = new HikariConfig();
    var jdbcUrl = System.getenv("jdbc:mysql://localhost:3306/blockbuster_proyecto");
    var username = System.getenv("blockbusterappuser");
    var password = System.getenv("blockbusterapppass");
    hikariConfig.setJdbcUrl(jdbcUrl);
    hikariConfig.setUsername(username);
    hikariConfig.setPassword(password);
    hikariConfig.addDataSourceProperty("connectionTestQuery", "SELECT 1");
    hikariConfig.addDataSourceProperty("maximunPoolSize", "4");
    hikariConfig.addDataSourceProperty("cachePrepStmts", "true");
    hikariConfig.addDataSourceProperty("prepStmtCacheSize", "250");
    hikariConfig.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
    
    HikariDataSource dataSource = new HikariDataSource(hikariConfig);
    //return new HikariDataSource(hikariConfig);
   
    //2 
    blockbusterRepository repository = new blockbusterRepository(dataSource);
    
    //3 Ejecutar findAll
    List<movie> movies = repository.findAll();
    for(movie m : movies){
    System.out.println(m.getId()+"/t"+m.getTitulo()+"/t"+ m.getCategory());
    }
    
    //4 Insertar una pelicula
    Category category = new Category();
    category.setId(1);
    movie movie = new movie();
    movie.setCategory(category);
    movie.setTitulo("Spider-man");
    
    movie newMovie = blockbusterRepository.save(movie);
    System.out.println(newMovie.getId()+"/t"+ newMovie.getTitulo()+"/t"+newMovie.getCategory().getId());
    
    List<movie> movie2 = blockbusterRepository.findAll();
    for(movie m : movie2){
    System.out.println(m.getId()+"/t"+m.getTitulo()+"/t"+m.getCategory().name());
  } */
}
