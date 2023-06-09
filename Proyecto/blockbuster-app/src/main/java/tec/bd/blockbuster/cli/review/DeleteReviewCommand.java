/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.review;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import tec.bd.Application;
import tec.bd.blockbuster.ApplicationContext;

@Command(name = "revd", description = "Delete Review")
public class DeleteReviewCommand implements Runnable {

    @CommandLine.Parameters(paramLabel = "<review id>", description = "Id of review")
    private long reviewId;

    @Override
    public void run() {
        var blockbuster = new Application().getBlockbusterReview();

        blockbuster.remove(reviewId);

        System.out.println("Review Id: " + reviewId + " was deleted successfully");
    }
}