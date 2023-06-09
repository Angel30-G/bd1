/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.dao;


import java.util.List;
import java.util.Optional;
import tec.bd.blockbuster.movie;
import tec.bd.blockbuster.review;

public interface ReviewDao extends GenericDao<review, Long> {

    Optional<review> findByTitle(String title);
    
    @Override
    List<review> findAll();

    @Override
    Optional<review> findById(Long movieId);

    @Override
    void save(review review);

    @Override
    Optional<review> update(review review);

    @Override
    void delete(Long movieId);
}
