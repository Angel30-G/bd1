/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.prestamos;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import tec.bd.Application;
import tec.bd.blockbuster.cli.movie.CreatedMovieCommand;
import tec.bd.blockbuster.movie;
import tec.bd.blockbuster.rentals;

@Command(name = "loanc", description = "Create Prestamos")
public class CreatedPrestamosCommand implements Runnable {
     private final static Logger LOGGER = LoggerFactory.getLogger(CreatedMovieCommand.class);
  
  @CommandLine.Parameters(paramLabel = "<rentals rental_date>", description = "Date")
    private Date rental_date;
  
  @CommandLine.Parameters(paramLabel = "<rentals client_id>", description = "Client rental")
    private int client_id;
    
   
  @CommandLine.Parameters(paramLabel = "<rentals movie_id>", description = "movie rental")
    private int movie_id;

    @Override
    public void run() {
        var blockbuster = new Application().getBlockbusterRental();

        blockbuster.getRental(client_id);

        System.out.println("Rental: " + client_id+ " was deleted successfully");
    }

  

    public Integer call() throws Exception {
        var rentals = new rentals();
         //movie.setId(movieId);
         rentals.setRental_date(rental_date);
         rentals.setMovie_id(movie_id);
         rentals.setClient_id(client_id);
 
   
            //LOGGER.error(e.getMessage(), e);
            return 1;
       
    }
}