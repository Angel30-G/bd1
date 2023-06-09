/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tec.bd.blockbuster.Category;
import tec.bd.blockbuster.dao.CategoryDao;
import tec.bd.blockbuster.dao.MovieDao;
import tec.bd.blockbuster.movie;

public class BlockbusterCategory {

    private final CategoryDao categoryDAO;

    public BlockbusterCategory(CategoryDao categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    /**
     * Lista todas las peliculas
     * @return
     */
    public List<Category> getAllCategory() {
        return this.categoryDAO.findAll();
    }

    /**
     * Agrega una pelicula
     * @param category
     */
    public void addNewCategory(Category category) {
        this.categoryDAO.save(category);
    }

    /**
     * Obtiene una pelicula por titulo
     * @param movieName
     * @return
     */
    public Category getCategoryNombre(String categoryName) {
        return this.categoryDAO.findByTitle(categoryName).orElse(null);
    }

    /**
     * Obtiene una pelicula por movieId
     * @param categoryId
     * @return
     */
    public Category getCategory(long categoryId) {
        return this.categoryDAO.findById(categoryId).orElse(null);
    }

    public void editCategory(String currentCategoryName, String newCategoryName) {
        var category = this.getCategoryNombre(currentCategoryName);
        category.setName(newCategoryName);
    }

    /**
     * Borra una pelicula
     * @param movieId
     */
    public void remove(long movieId) {
        this.categoryDAO.delete(movieId);
    }

}
