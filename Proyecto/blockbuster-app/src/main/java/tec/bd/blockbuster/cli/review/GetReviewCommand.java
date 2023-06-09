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
import tec.bd.BlockbusterReview;
import tec.bd.blockbuster.movie;
import tec.bd.blockbuster.review;

@Command(name = "revr", description = "Get All Reviews")
public class GetReviewCommand implements Runnable {

    @Parameters(paramLabel = "<review id>", description = "Id of review", defaultValue = "0")
    private long reviewId;

    @Override
    public void run() {

        System.out.println("reviewId: " + reviewId);
        BlockbusterReview blockbuster = new Application().getBlockbusterReview();

        if (reviewId != 0) {
            // La logica encontrar por movieId
            System.out.println("=== Get Review Id === ");
            var review = blockbuster.getReview(reviewId);

            System.out.println("Rating: "+ review.getRating() + ", Comentario: " + review.getReview_text());

        } else {

            System.out.println("=== Get All Reviews === ");

            List<review> review = blockbuster.getAllReview();

            System.out.println("Codigo \t\t Descripcion");
            for (review m : review) {
                System.out.println(m.getId() + "\t\t" + m.getRating());
            }

        }
    }

}
