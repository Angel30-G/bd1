/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.review;

import picocli.CommandLine.Command;
import tec.bd.Application;

@Command(name = "revu", description = "Update Review")
public class UpdateReviewCommand implements Runnable {
    private String reviewOld;
    private String reviewNew;

    @Override
    public void run() {
        var blockbusterReview = new Application().getBlockbusterReview();
        
        var category = blockbusterReview.getReviewRating(reviewOld);
        

        blockbusterReview.editReviewRating(reviewOld, reviewNew);

        System.out.println("New Category: " + reviewNew + " was modified successfully");
    
    
    }

}
