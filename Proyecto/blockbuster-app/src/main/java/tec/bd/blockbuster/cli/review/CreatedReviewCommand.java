/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.review;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import tec.bd.Application;
import tec.bd.blockbuster.cli.movie.CreatedMovieCommand;
import tec.bd.blockbuster.movie;
import tec.bd.blockbuster.review;

@Command(name = "revc", description = "Create Review")
public class CreatedReviewCommand implements Runnable {
      private final static Logger LOGGER = LoggerFactory.getLogger(CreatedMovieCommand.class);
  
  @CommandLine.Parameters(paramLabel = "<movie title>", description = "Id of movie")
    private int rating;
  
  @CommandLine.Parameters(paramLabel = "<movie title>", description = "Id of movie")
    private String review_text;
  
  @CommandLine.Parameters(paramLabel = "<release_date>", description = "The movie title")
    private Date created_on;
  
  @CommandLine.Parameters(paramLabel = "<category>", description = "The movie title")
    private int client_id;
    
   
  @CommandLine.Parameters(paramLabel = "<units_available>", description = "The movie title")
    private int movie_id;
     

    @Override
    public void run() {
        var blockbuster = new Application().getBlockbusterReview();

        blockbuster.getReview(rating);

        System.out.println("Review: " + rating + " was create successfully");
    }
    


    public Integer call() throws Exception {
        var review = new review();
         //movie.setId(movieId);
         review.setRating(rating);
         review.setReview_text(review_text);
         review.setCreated_on(created_on);
         review.setClient_id(client_id);
         review.setMovie_id(movie_id);
            //LOGGER.error(e.getMessage(), e);
            return 1;
       
    }
}
