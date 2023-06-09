/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.review;

import picocli.CommandLine.Parameters;
import picocli.CommandLine.Command;

import java.util.List;
import tec.bd.Application;
import tec.bd.Blockbuster;
import tec.bd.blockbuster.movie;

@Command(name = "revr", description = "Get All Reviews")
public class GetReviewCommand implements Runnable {

    @Parameters(paramLabel = "<review id>", description = "Id of review", defaultValue = "0")
    private long reviewId;

    @Override
    public void run() {

        System.out.println("reviewId: " + reviewId);
        Blockbuster blockbuster = new Application().getBlockbuster();

        if (reviewId != 0) {
            // La logica encontrar por movieId
            System.out.println("=== Get Review Id === ");
            var movie = blockbuster.getMovie(reviewId);

            System.out.println("Descripcion: "+ movie.getTitulo() + ", Id: " + movie.getId());

        } else {

            System.out.println("=== Get All Reviews === ");

            List<movie> movies = blockbuster.getAllMovies();

            System.out.println("Codigo \t\t Descripcion");
            for (movie m : movies) {
                System.out.println(m.getId() + "\t\t" + m.getTitulo());
            }

        }
    }

}
