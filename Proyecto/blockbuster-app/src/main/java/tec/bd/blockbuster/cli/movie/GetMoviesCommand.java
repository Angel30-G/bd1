/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.movie;

import picocli.CommandLine.Parameters;
import picocli.CommandLine.Command;

import java.util.List;
import tec.bd.Application;
import tec.bd.Blockbuster;
import tec.bd.blockbuster.movie;

@Command(name = "movr", description = "Get All Movies")
public class GetMoviesCommand implements Runnable {

    @Parameters(paramLabel = "<movie id>", description = "Id of movie", defaultValue = "0")
    private long movieId;

    @Override
    public void run() {

        System.out.println("movieId: " + movieId);
        Blockbuster blockbuster = new Application().getBlockbuster();

        if (movieId != 0) {
            // La logica encontrar por movieId
            System.out.println("=== Get Movie Id === ");
            var movie = blockbuster.getMovie(movieId);

            System.out.println("Title: "+ movie.getTitulo() + ", Id: " + movie.getId());

        } else {

            System.out.println("=== Get All Movies === ");

            List<movie> movies = blockbuster.getAllMovies();

            System.out.println("Codigo \t\t Titulo");
            for (movie m : movies) {
                System.out.println(m.getId() + "\t\t" + m.getTitulo());
            }

        }
    }

}