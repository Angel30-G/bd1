/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.dao;


import java.util.List;
import java.util.Optional;
import tec.bd.blockbuster.Category;
import tec.bd.blockbuster.movie;

public interface CategoryDao extends GenericDao<Category, Long> {

    Optional<Category> findByTitle(String title);
    
    @Override
    List<Category> findAll();

    @Override
    Optional<Category> findById(Long categoryId);

    @Override
    void save(Category category);

    @Override
    Optional<Category> update(Category category);

    @Override
    void delete(Long movieId);
}
