/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tec.bd.blockbuster.dao.MovieDao;
import tec.bd.blockbuster.movie;

public class Blockbuster {

    private final MovieDao movieDAO;

    public Blockbuster(MovieDao movieDAO) {
        this.movieDAO = movieDAO;
    }

    /**
     * Lista todas las peliculas
     * @return
     */
    public List<movie> getAllMovies() {
        return this.movieDAO.findAll();
    }

    /**
     * Agrega una pelicula
     * @param movie
     */
    public void addNewMovie(movie movie) {
        this.movieDAO.save(movie);
    }

    /**
     * Obtiene una pelicula por titulo
     * @param movieName
     * @return
     */
    public movie getMovie(String movieName) {
        return this.movieDAO.findByTitle(movieName).orElse(null);
    }

    /**
     * Obtiene una pelicula por movieId
     * @param movieId
     * @return
     */
    public movie getMovie(long movieId) {
        return this.movieDAO.findById(movieId).orElse(null);
    }

    public void editMovieTitle(String currentMovieName, String newMovieName) {
        var movie = this.getMovie(currentMovieName);
        movie.setTitle(newMovieName);
    }

    /**
     * Borra una pelicula
     * @param movieId
     */
    public void remove(long movieId) {
        this.movieDAO.delete(movieId);
    }

}
