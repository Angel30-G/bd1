/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.dao;


import java.util.List;
import java.util.Optional;
import tec.bd.blockbuster.clients;
import tec.bd.blockbuster.movie;

public interface ClientDao extends GenericDao<clients, Long> {

    Optional<clients> findByTitle(String client);
    
    @Override
    List<clients> findAll();

    @Override
    Optional<clients> findById(Long movieId);

    @Override
    void save(clients client);

    @Override
    Optional<clients> update(clients client);

    @Override
    void delete(Long movieId);
}