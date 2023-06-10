/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.movie;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import tec.bd.Application;
import tec.bd.blockbuster.clients;
import tec.bd.blockbuster.movie;

@Command(name = "movc", description = "Create Movies")
public class CreatedMovieCommand implements Runnable {
  @CommandLine.Parameters(paramLabel = "<movie id>", description = "Id of movie")
    private movie movieId;

    @Override
    public void run() {
         var blockbuster = new Application().getBlockbuster();

        blockbuster.addNewMovie(movieId);

        System.out.println("Category: " + movieId + " was creat successfully");
    }
}