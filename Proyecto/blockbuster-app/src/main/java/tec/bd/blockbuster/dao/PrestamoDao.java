/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.dao;


import java.util.List;
import java.util.Optional;
import tec.bd.blockbuster.movie;

public interface PrestamoDao extends GenericDao<movie, Long> {

    Optional<movie> findByTitle(String title);
    
    @Override
    List<movie> findAll();

    @Override
    Optional<movie> findById(Long movieId);

    @Override
    void save(movie movie);

    @Override
    Optional<movie> update(movie movie);

    @Override
    void delete(Long movieId);
}
