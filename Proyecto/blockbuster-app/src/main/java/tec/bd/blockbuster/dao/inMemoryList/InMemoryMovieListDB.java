/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.dao.inMemoryList;


import java.util.List;
import java.util.Optional;
import tec.bd.blockbuster.dao.MovieDao;
import tec.bd.blockbuster.movie;

public class InMemoryMovieListDB implements MovieDao {


    @Override
    public Optional<movie> findByTitle(String title) {
        return null;
    }

    @Override
    public List<movie> findAll() {
        return null;
    }

    @Override
    public Optional<movie> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void save(movie movie) {

    }

    @Override
    public Optional<movie> update(movie movie) {
        return Optional.empty();
    }

    @Override
    public void delete(Long aLong) {

    }
}
