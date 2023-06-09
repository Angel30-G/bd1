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
import tec.bd.blockbuster.dao.PrestamoDao;
import tec.bd.blockbuster.movie;
import tec.bd.blockbuster.rentals;

public class BlockbusterRental {

    private final PrestamoDao prestamoDAO;

    public BlockbusterRental(PrestamoDao prestamoDAO) {
        this.prestamoDAO = prestamoDAO;
    }

    /**
     * Lista todas las peliculas
     * @return
     */
    public List<rentals> getAllRental() {
        return this.prestamoDAO.findAll();
    }

    /**
     * Agrega una pelicula
     * @param rental
     */
    public void addNewRental(rentals rental) {
        this.prestamoDAO.save(rental);
    }

    /**
     * Obtiene una pelicula por titulo
     * @param rentalName
     * @return
     */
    public rentals getRentalDate(String rentalName) {
        return this.prestamoDAO.findByTitle(rentalName).orElse(null);
    }

    /**
     * Obtiene una pelicula por movieId
     * @param rentalId
     * @return
     */
    public rentals getRental(long rentalId) {
        return this.prestamoDAO.findById(rentalId).orElse(null);
    }

    public void editRental(String currentRentalName, String newRentalName) {
        var rental = this.getRentalDate(currentRentalName);
        //rental.getMovie_id(newRenName);
    }

    /**
     * Borra una pelicula
     * @param rentalId
     */
    public void remove(long rentalId) {
        this.prestamoDAO.delete(rentalId);
    }

}

