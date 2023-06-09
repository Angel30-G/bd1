/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.client;

import picocli.CommandLine.Parameters;
import picocli.CommandLine.Command;

import java.util.List;
import tec.bd.Application;
import tec.bd.Blockbuster;
import tec.bd.blockbuster.movie;

@Command(name = "clir", description = "Get All Clients")
public class GetClientCommand implements Runnable {

    @Parameters(paramLabel = "<client id>", description = "Id of Clients", defaultValue = "0")
    private long clientId;

    @Override
    public void run() {

        System.out.println("clientId: " + clientId);
        Blockbuster blockbuster = new Application().getBlockbuster();

        if (clientId != 0) {
            // La logica encontrar por movieId
            System.out.println("=== Get Movie Id === ");
            var movie = blockbuster.getMovie(clientId);

            System.out.println("Nombre: "+ movie.getTitulo() + ", Id: " + movie.getId());

        } else {

            System.out.println("=== Get All Clients === ");

            List<movie> movies = blockbuster.getAllMovies();

            System.out.println("Codigo \t\t Nombre");
            for (movie m : movies) {
                System.out.println(m.getId() + "\t\t" + m.getTitulo());
            }

        }
    }

}
