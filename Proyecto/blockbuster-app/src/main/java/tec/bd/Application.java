/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import tec.bd.blockbuster.dao.MovieDao;
import tec.bd.blockbuster.dao.mysql.MovieDaoImpl;

import javax.sql.DataSource;
import tec.bd.blockbuster.dao.CategoryDao;
import tec.bd.blockbuster.dao.inMemoryList.InMemoryMovieListDB;

public class Application {


    private Blockbuster blockbuster;
    private BlockbusterCategory blockbusterCategory;
    private BlockbusterClient blockbusterClient;
    private BlockbusterClient blockbusterRental;
    private BlockbusterClient blockbusterReview;


    public Application() {

        var hikariDataSource = initHikariDataSource();
        var mysqlMovies = initMysqlMovieDAO(hikariDataSource);
        var mysqlCategory = initMysqlCategoryDAO(hikariDataSource);
        var mysqlClient = initMysqlCategoryDAO(hikariDataSource);
        var mysqlPrestamo = initMysqlCategoryDAO(hikariDataSource);
        var mysqlReview = initMysqlCategoryDAO(hikariDataSource);
        var listMovies = initInMemoryListMovieDAO();

        this.blockbuster = initBlockbuster(mysqlMovies);
        this.blockbusterCategory = initBlockbusterCategory((CategoryDao) mysqlCategory);
    }



    private static HikariDataSource initHikariDataSource() {
        HikariConfig config = new HikariConfig("/database.properties");
        HikariDataSource dataSource = new HikariDataSource(config);
        return dataSource;
    }

    public static MovieDao initMysqlMovieDAO(DataSource dataSource) {
        return new MovieDaoImpl(dataSource);
    }

    public static MovieDao initInMemoryListMovieDAO() {
        return new InMemoryMovieListDB();
    }

    public static Blockbuster initBlockbuster(MovieDao movieDAO) {
        return new Blockbuster(movieDAO);
    }

    public Blockbuster getBlockbuster() {
        return blockbuster;
    }
    
    //Datos de Categoria
    public static MovieDao initMysqlCategoryDAO(DataSource dataSource) {
        return new MovieDaoImpl(dataSource);
    }
    
     public static CategoryDao initInMemoryListCategoryDAO() {
        return (CategoryDao) new InMemoryMovieListDB();
    }

    public static BlockbusterCategory initBlockbusterCategory(CategoryDao categoryDAO) {
        return new BlockbusterCategory(categoryDAO);
    }

    public BlockbusterCategory getBlockbusterCategory() {
        return blockbusterCategory;
    }
    
    //Datos de Clientes
      public static MovieDao initMysqlClientDAO(DataSource dataSource) {
        return new MovieDaoImpl(dataSource);
    }
    
     public static CategoryDao initInMemoryListCategoryDAO() {
        return (CategoryDao) new InMemoryMovieListDB();
    }

    public static BlockbusterCategory initBlockbusterCategory(CategoryDao categoryDAO) {
        return new BlockbusterCategory(categoryDAO);
    }

    public BlockbusterCategory getBlockbusterCategory() {
        return blockbusterCategory;
    }
}
