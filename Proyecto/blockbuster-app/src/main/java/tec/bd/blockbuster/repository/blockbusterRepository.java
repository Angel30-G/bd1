/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.repository;

import java.util.List;
import java.util.Optional;
import tec.bd.blockbuster.movie;

/**
 *
 * @author pc
 */
public interface blockbusterRepository {
    List<movie> findAll();
    
    Optional<movie> findById(int id);
    
    void save(movie movie);
}
