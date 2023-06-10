/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.movie;

import picocli.CommandLine.Parameters;
import picocli.CommandLine.Command;
import tec.bd.Application;
import tec.bd.blockbuster.ApplicationContext;

@Command(name = "movt", description = "Search Movies by Title")
public class GetByTittleCommand implements Runnable {

    @Parameters(paramLabel = "<movie title>", description = "Title of movie")
    private String title;

    /**
     * mvn exec:java -Dexec.args="movt 'Spider Man'"
     */
    @Override
    public void run() {

        var blockbuster = new Application().getBlockbuster();
        var movie = blockbuster.getMovie(title);

        System.out.println("Id " + movie.getId() + ", Titulo " + movie.getTitle());

    }
}

