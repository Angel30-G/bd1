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
import tec.bd.blockbuster.review;

public class BlockbusterReview {

    private final ReviewDao reviewDAO;

    public BlockbusterReview(ReviewDao reviewDAO) {
        this.reviewDAO = reviewDAO;
    }

    /**
     * Lista todas las peliculas
     * @return
     */
    public List<review> getAllReview() {
        return this.reviewDAO.findAll();
    }

    /**
     * Agrega una pelicula
     * @param review
     */
    public void addNewReview(review review) {
        this.reviewDAO.save(review);
    }

    /**
     * Obtiene una pelicula por titulo
     * @param reviewName
     * @return
     */
    public review getReviewRating(String reviewName) {
        return this.reviewDAO.findByTitle(reviewName).orElse(null);
    }

    /**
     * Obtiene una pelicula por movieId
     * @param reviewId
     * @return
     */
    public review getReview(long reviewId) {
        return this.reviewDAO.findById(reviewId).orElse(null);
    }

    public void editReviewRating(String currentReviewName, String newReviewName) {
        var review = this.getReviewRating(currentReviewName);
        review.setReview_text(newReviewName);
    }

    /**
     * Borra una pelicula
     * @param reviewId
     */
    public void remove(long reviewId) {
        this.reviewDAO.delete(reviewId);
    }

}

