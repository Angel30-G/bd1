/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.dao;


import java.util.List;
import java.util.Optional;
import tec.bd.blockbuster.log;
import tec.bd.blockbuster.movie;

public interface LogDao extends GenericDao<log, Long> {

    Optional<movie> findByTitle(String title);
    
    @Override
    List<log> findAll();

    @Override
    Optional<log> findById(Long movieId);

    @Override
    void save(log log);

    @Override
    Optional<log> update(log log);

    @Override
    void delete(Long movieId);
}
