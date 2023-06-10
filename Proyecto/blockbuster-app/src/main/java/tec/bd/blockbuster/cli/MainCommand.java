/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli;

/**
 *
 * @author pc
 */
import picocli.CommandLine.Command;
import picocli.CommandLine.HelpCommand;
import tec.bd.blockbuster.cli.category.CreatedCategoryCommand;
import tec.bd.blockbuster.cli.category.DeleteCategoryCommand;
import tec.bd.blockbuster.cli.category.GetCategoryCommand;
import tec.bd.blockbuster.cli.category.UpdateCategoryCommand;
import tec.bd.blockbuster.cli.client.CreatedClientCommand;
import tec.bd.blockbuster.cli.client.DeleteClientCommand;
import tec.bd.blockbuster.cli.client.GetClientCommand;
import tec.bd.blockbuster.cli.client.UpdateClientCommand;
import tec.bd.blockbuster.cli.log.logCommand;
import tec.bd.blockbuster.cli.movie.*;
import tec.bd.blockbuster.cli.prestamos.CreatedPrestamosCommand;
import tec.bd.blockbuster.cli.prestamos.DeletePrestamosCommand;
import tec.bd.blockbuster.cli.prestamos.GetPrestamosCommand;
import tec.bd.blockbuster.cli.prestamos.UpdatePrestamosCommand;
import tec.bd.blockbuster.cli.review.CreatedReviewCommand;
import tec.bd.blockbuster.cli.review.DeleteReviewCommand;
import tec.bd.blockbuster.cli.review.GetReviewCommand;
import tec.bd.blockbuster.cli.review.UpdateReviewCommand;

@Command(
        name = "blockbuster-app",
        subcommands = {
                GetMoviesCommand.class,
                GetByTittleCommand.class,
                CreatedMovieCommand.class,
                DeleteMovieCommand.class,
                UpdateMoviesCommand.class,
                //HelpCommand.class,
                
                GetCategoryCommand.class,
                //GetByTittleCommand.class,
                CreatedCategoryCommand.class,
                DeleteCategoryCommand.class,
                UpdateCategoryCommand.class,
                
                 GetClientCommand.class,
                //GetClientCommand.class,
                CreatedClientCommand.class,
                DeleteClientCommand.class,
                UpdateClientCommand.class,
                //HelpCommand.class,
                
                logCommand.class,
                //GetByTittleCommand.class,
                //CreateMovieCommand.class,
                //DeleteMovieCommand.class,
                //UpdateMoviesCommand.class,
                //HelpCommand.class
                
                GetPrestamosCommand.class,
                //GetByTittleCommand.class,
                CreatedPrestamosCommand.class,
                DeletePrestamosCommand.class,
                UpdatePrestamosCommand.class,
                //HelpCommand.class
                
                GetReviewCommand.class,
                //GetReviewCommand.class,
                CreatedReviewCommand.class,
                DeleteReviewCommand.class,
                UpdateReviewCommand.class,
                HelpCommand.class

        },
        description = "Manage Movies")

public class MainCommand implements Runnable {

    @Override
    public void run() {

    }
}