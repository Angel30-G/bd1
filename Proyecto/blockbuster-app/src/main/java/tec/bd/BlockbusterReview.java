/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tec.bd.blockbuster.dao.CategoryDao;
import tec.bd.blockbuster.dao.ClientDao;
import tec.bd.blockbuster.dao.MovieDao;
import tec.bd.blockbuster.dao.ReviewDao;
import tec.bd.blockbuster.movie;

public class BlockbusterReview {

    private final ReviewDao reviewDAO;

    public BlockbusterReview(ReviewDao reviewDAO) {
        this.reviewDAO = reviewDAO;
    }

    /**
     * Lista todas las peliculas
     * @return
     */
    public List<movie> getAllMovies() {
        return this.reviewDAO.findAll();
    }

    /**
     * Agrega una pelicula
     * @param movie
     */
    public void addNewMovie(movie movie) {
        this.reviewDAO.save(movie);
    }

    /**
     * Obtiene una pelicula por titulo
     * @param movieName
     * @return
     */
    public movie getMovie(String movieName) {
        return this.reviewDAO.findByTitle(movieName).orElse(null);
    }

    /**
     * Obtiene una pelicula por movieId
     * @param movieId
     * @return
     */
    public movie getMovie(long movieId) {
        return this.reviewDAO.findById(movieId).orElse(null);
    }

    public void editMovieTitle(String currentMovieName, String newMovieName) {
        var movie = this.getMovie(currentMovieName);
        movie.setTitulo(newMovieName);
    }

    /**
     * Borra una pelicula
     * @param movieId
     */
    public void remove(long movieId) {
        this.reviewDAO.delete(movieId);
    }

}

