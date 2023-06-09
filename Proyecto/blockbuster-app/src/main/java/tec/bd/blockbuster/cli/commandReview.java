/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli;

import picocli.CommandLine.Command;
import picocli.CommandLine.HelpCommand;
import tec.bd.blockbuster.cli.movie.*;
import tec.bd.blockbuster.cli.review.CreatedReviewCommand;
import tec.bd.blockbuster.cli.review.DeleteReviewCommand;
import tec.bd.blockbuster.cli.review.GetReviewCommand;
import tec.bd.blockbuster.cli.review.UpdateReviewCommand;

@Command(
        name = "blockbuster-app",
        subcommands = {
                GetReviewCommand.class,
                //GetReviewCommand.class,
                CreatedReviewCommand.class,
                DeleteReviewCommand.class,
                UpdateReviewCommand.class,
                HelpCommand.class
        },
        description = "Manage Reviews")
public class commandReview implements Runnable {

    @Override
    public void run() {

    }
}
