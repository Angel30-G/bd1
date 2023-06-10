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

import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import tec.bd.Application;
import tec.bd.blockbuster.Category;
import tec.bd.blockbuster.movie;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.Callable;

@Command(name = "movc", description = "Create Movies")
public class CreatedMovieCommand implements Callable<Integer> {
    private final static Logger LOGGER = LoggerFactory.getLogger(CreatedMovieCommand.class);
  
  @Parameters(paramLabel = "<movie title>", description = "Id of movie")
    private String title;
  
  @Parameters(paramLabel = "<release_date>", description = "The movie title")
    private Date release_date;
  
  @Parameters(paramLabel = "<category>", description = "The movie title")
    private int category;
    
   
  @Parameters(paramLabel = "<units_available>", description = "The movie title")
    private int unit_available;

 

    @Override
    public Integer call() throws Exception {
        var movie = new movie();
         //movie.setId(movieId);
         movie.setTitle(title);
         movie.setCategory(category);
         movie.setUnit_available(unit_available);
        
 
   
            //LOGGER.error(e.getMessage(), e);
            return 1;
       
    }
         
        
}
