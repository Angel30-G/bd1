/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.movie;

import picocli.CommandLine.Command;
import tec.bd.Application;

@Command(name = "movu", description = "Update Movie")
public class UpdateMoviesCommand implements Runnable {
    private String movieOld;
    private String movieNew;

    @Override
    public void run() {
        var blockbuster = new Application().getBlockbuster();
        
        var movie = blockbuster.getMovie(movieOld);
        

        blockbuster.editMovieTitle(movieOld, movieNew);

        System.out.println("New Category: " + movieNew + " was modified successfully");
    
    
    }

}
