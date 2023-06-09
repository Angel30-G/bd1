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
import tec.bd.blockbuster.cli.movie.*;

@Command(
        name = "blockbuster-app",
        subcommands = {
                GetMoviesCommand.class,
                GetByTittleCommand.class,
                //CreateMovieCommand.class,
                DeleteMovieCommand.class,
                UpdateMoviesCommand.class,
                HelpCommand.class
        },
        description = "Manage Movies")
public class MainCommand implements Runnable {

    @Override
    public void run() {

    }
}