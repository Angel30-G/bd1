/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli;

import picocli.CommandLine.Command;
import picocli.CommandLine.HelpCommand;
import tec.bd.blockbuster.cli.log.logCommand;

@Command(
        name = "blockbuster-app",
        subcommands = {
                logCommand.class,
                //GetByTittleCommand.class,
                //CreateMovieCommand.class,
                //DeleteMovieCommand.class,
                //UpdateMoviesCommand.class,
                //HelpCommand.class
        },
        description = "Manage Logs")
public class commandLog implements Runnable {

    @Override
    public void run() {

    }
}
