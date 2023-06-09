/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tec.bd.blockbuster.clients;
import tec.bd.blockbuster.dao.CategoryDao;
import tec.bd.blockbuster.dao.ClientDao;
import tec.bd.blockbuster.dao.MovieDao;
import tec.bd.blockbuster.movie;

public class BlockbusterClient {

    private final ClientDao clientDAO;

    public BlockbusterClient(ClientDao clientDAO) {
        this.clientDAO = clientDAO;
    }

    /**
     * Lista todas las peliculas
     * @return
     */
    public List<clients> getAllClient() {
        return this.clientDAO.findAll();
    }

    /**
     * Agrega una pelicula
     * @param client
     */
    public void addNewClient(clients client) {
        this.clientDAO.save(client);
    }

    /**
     * Obtiene una pelicula por titulo
     * @param clientName
     * @return
     */
    public clients getClient(String clientName) {
        return this.clientDAO.findByTitle(clientName).orElse(null);
    }

    /**
     * Obtiene una pelicula por movieId
     * @param clientId
     * @return
     */
    public clients getClient(long clientId) {
        return this.clientDAO.findById(clientId).orElse(null);
    }

    public void editClientName(String currentClientName, String newClientName) {
        var client = this.getClient(currentClientName);
        client.setNombre(newClientName);
    }

    /**
     * Borra una pelicula
     * @param clientId
     */
    public void remove(long clientId) {
        this.clientDAO.delete(clientId);
    }

}
