/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.prestamos;

import picocli.CommandLine.Parameters;
import picocli.CommandLine.Command;

import java.util.List;
import tec.bd.Application;
import tec.bd.Blockbuster;
import tec.bd.blockbuster.movie;

@Command(name = "loanr", description = "Get All Rentals")
public class GetPrestamosCommand implements Runnable {

    @Parameters(paramLabel = "<Rentals id>", description = "Id of Rentals", defaultValue = "0")
    private long rentalsId;

    @Override
    public void run() {

        System.out.println("rentalsId: " + rentalsId);
        Blockbuster blockbuster = new Application().getBlockbuster();

        if (rentalsId != 0) {
            // La logica encontrar por movieId
            System.out.println("=== Get Rentals Id === ");
            var movie = blockbuster.getMovie(rentalsId);

            System.out.println("Date: "+ movie.getTitulo() + ", Id: " + movie.getId());

        } else {

            System.out.println("=== Get All Rentals === ");

            List<movie> movies = blockbuster.getAllMovies();

            System.out.println("Codigo \t\t Date");
            for (movie m : movies) {
                System.out.println(m.getId() + "\t\t" + m.getTitulo());
            }

        }
    }

}