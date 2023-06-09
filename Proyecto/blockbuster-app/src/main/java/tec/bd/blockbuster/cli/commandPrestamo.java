/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli;

import picocli.CommandLine.Command;
import picocli.CommandLine.HelpCommand;
import tec.bd.blockbuster.cli.movie.*;
import tec.bd.blockbuster.cli.prestamos.DeletePrestamosCommand;
import tec.bd.blockbuster.cli.prestamos.GetPrestamosCommand;
import tec.bd.blockbuster.cli.prestamos.UpdatePrestamosCommand;

@Command(
        name = "blockbuster-app",
        subcommands = {
                GetPrestamosCommand.class,
                //GetByTittleCommand.class,
                //CreateMovieCommand.class,
                DeletePrestamosCommand.class,
                UpdatePrestamosCommand.class,
                HelpCommand.class
        },
        description = "Manage Prestamos")
public class commandPrestamo implements Runnable {

    @Override
    public void run() {

    }
}