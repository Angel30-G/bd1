/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.dao;


import java.util.List;
import java.util.Optional;
import tec.bd.blockbuster.movie;
import tec.bd.blockbuster.rentals;

public interface PrestamoDao extends GenericDao<rentals, Long> {

    Optional<rentals> findByTitle(String title);
    
    @Override
    List<rentals> findAll();

    @Override
    Optional<rentals> findById(Long rentalsId);

    @Override
    void save(rentals rental);

    @Override
    Optional<rentals> update(rentals rental);

    @Override
    void delete(Long rentalId);
}
