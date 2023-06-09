/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.category;

import picocli.CommandLine.Parameters;
import picocli.CommandLine.Command;

import java.util.List;
import tec.bd.Application;
import tec.bd.Blockbuster;
import tec.bd.blockbuster.movie;

@Command(name = "catr", description = "Get All Categories")
public class GetCategoryCommand implements Runnable {

    @Parameters(paramLabel = "<category id>", description = "Id of Category", defaultValue = "0")
    private int categoryId;

    @Override
    public void run() {

        System.out.println("categoryId: " + categoryId);
        Blockbuster blockbuster = new Application().getBlockbuster();

        if (categoryId != 0) {
            // La logica encontrar por movieId
            System.out.println("=== Get Category Id === ");
            var movie = blockbuster.getMovie(categoryId);

            System.out.println("Category: "+ movie.getTitulo() + ", Id: " + movie.getId());

        } else {

            System.out.println("=== Get All Categories === ");

            List<movie> movies = blockbuster.getAllMovies();

            System.out.println("Codigo \t\t Category");
            for (movie m : movies) {
                System.out.println(m.getId() + "\t\t" + m.getTitulo());
            }

        }
    }

}
