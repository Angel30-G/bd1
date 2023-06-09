/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.movie;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import tec.bd.Application;
import tec.bd.blockbuster.ApplicationContext;

@Command(name = "movd", description = "Delete Movie")
public class DeleteMovieCommand implements Runnable {

    @CommandLine.Parameters(paramLabel = "<movie id>", description = "Id of movie")
    private long movieId;

    @Override
    public void run() {
        var blockbuster = new Application().getBlockbuster();

        blockbuster.remove(movieId);

        System.out.println("Movie Id: " + movieId + " was deleted successfully");
    }
}