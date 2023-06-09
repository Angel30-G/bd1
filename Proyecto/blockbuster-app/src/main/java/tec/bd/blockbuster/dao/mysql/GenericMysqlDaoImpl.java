/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.dao.mysql;

import tec.bd.blockbuster.dao.GenericDao;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class GenericMysqlDaoImpl<T, ID extends Serializable> implements GenericDao<T, ID> {

    protected abstract T resultSetToEntity(ResultSet resultSet) throws SQLException;

    protected abstract List<T> resultSetToList(ResultSet resultSet) throws SQLException;

}