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
import tec.bd.blockbuster.dao.ClientDao;
import tec.bd.blockbuster.dao.PrestamoDao;
import tec.bd.blockbuster.dao.ReviewDao;
import tec.bd.blockbuster.dao.inMemoryList.InMemoryMovieListDB;
import tec.bd.blockbuster.dao.mysql.CategoryDaoImpl;
import tec.bd.blockbuster.dao.mysql.ClientDaoImpl;
import tec.bd.blockbuster.dao.mysql.PrestamoDaoImpl;
import tec.bd.blockbuster.dao.mysql.ReviewDaoImpl;

public class Application {


    private Blockbuster blockbuster;
    private BlockbusterCategory blockbusterCategory;
    private BlockbusterClient blockbusterClient;
    private BlockbusterRental blockbusterRental;
    private BlockbusterReview blockbusterReview;


    public Application() {

        var hikariDataSource = initHikariDataSource();
        var mysqlMovies = initMysqlMovieDAO(hikariDataSource);
        var mysqlCategory = initMysqlCategoryDAO(hikariDataSource);
        var mysqlClient = initMysqlClientDAO(hikariDataSource);
        var mysqlPrestamo = initMysqlPrestamoDAO(hikariDataSource);
        var mysqlReview = initMysqlReviewDAO(hikariDataSource);
        var listMovies = initInMemoryListMovieDAO();

        this.blockbuster = initBlockbuster(mysqlMovies);
        this.blockbusterCategory = initBlockbusterCategory((CategoryDao) mysqlCategory);
        this.blockbusterClient = initBlockbusterClient((ClientDao) mysqlClient);
        this.blockbusterRental = initBlockbusterPrestamo((PrestamoDao) mysqlPrestamo);
        this.blockbusterReview = initBlockbusterReview((ReviewDao) mysqlReview);
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
    public static CategoryDaoImpl initMysqlCategoryDAO(DataSource dataSource) {
        return new CategoryDaoImpl(dataSource);
    }
    
   /*  public static CategoryDao initInMemoryListCategoryDAO() {
        return (CategoryDao) new InMemoryMovieListDB();
    }*/

    public static BlockbusterCategory initBlockbusterCategory(CategoryDao categoryDAO) {
        return new BlockbusterCategory(categoryDAO);
    }

    public BlockbusterCategory getBlockbusterCategory() {
        return blockbusterCategory;
    }
    
    //Datos de Clientes
      public static ClientDaoImpl initMysqlClientDAO(DataSource dataSource) {
        return new ClientDaoImpl(dataSource);
    }
    
    /* public static ClientDao initInMemoryListClientDAO() {
        return (ClientDao) new InMemoryMovieListDB();
    }*/

    public static BlockbusterClient initBlockbusterClient(ClientDao clientDAO) {
        return new BlockbusterClient(clientDAO);
    }

    public BlockbusterClient getBlockbusterClient() {
        return blockbusterClient;
    }
    
    //Datos de Rentals
     public static PrestamoDaoImpl initMysqlPrestamoDAO(DataSource dataSource) {
        return new PrestamoDaoImpl(dataSource);
    }
    
     /*public static PrestamoDao initInMemoryListPrestamoDAO() {
        return (PrestamoDao) new InMemoryMovieListDB();
    }*/

    public static BlockbusterRental initBlockbusterPrestamo(PrestamoDao prestamoDAO) {
        return new BlockbusterRental(prestamoDAO);
    }

    public BlockbusterRental getBlockbusterRental() {
        return blockbusterRental;
    }
    
    //Datos de Review
      public static ReviewDaoImpl initMysqlReviewDAO(DataSource dataSource) {
        return new ReviewDaoImpl(dataSource);
    }
    
    /* public static ReviewDao initInMemoryListReviewDAO() {
        return (ReviewDao) new InMemoryMovieListDB();
    }*/

    public static BlockbusterReview initBlockbusterReview(ReviewDao reviewDAO) {
        return new BlockbusterReview(reviewDAO);
    }

    public BlockbusterReview getBlockbusterReview() {
        return blockbusterReview;
    }
}
