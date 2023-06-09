/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.review;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import tec.bd.Application;

@Command(name = "revc", description = "Create Review")
public class CreatedReviewCommand implements Runnable {
     @CommandLine.Parameters(paramLabel = "<review id>", description = "Id of review")
    private int reviewId;

    @Override
    public void run() {
        var blockbuster = new Application().getBlockbusterReview();

        blockbuster.getReview(reviewId);

        System.out.println("Rental: " + reviewId + " was deleted successfully");
    }
}
