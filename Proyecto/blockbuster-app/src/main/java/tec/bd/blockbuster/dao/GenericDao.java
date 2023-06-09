/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface GenericDao<T, ID extends Serializable> {

    List<T> findAll();

    Optional<T> findById(ID id);

    void save(T t);

    Optional<T> update(T t);

    void delete(ID id);
}