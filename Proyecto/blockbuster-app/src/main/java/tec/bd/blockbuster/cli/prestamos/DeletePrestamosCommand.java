/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.prestamos;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import tec.bd.Application;
import tec.bd.blockbuster.ApplicationContext;

@Command(name = "loand", description = "Delete Prestamos")
public class DeletePrestamosCommand implements Runnable {

    @CommandLine.Parameters(paramLabel = "<prestamos id>", description = "Id of Prestamos")
    private long rentalsId;

    @Override
    public void run() {
        var blockbuster = new Application().getBlockbuster();

        blockbuster.remove(rentalsId);

        System.out.println("Rentals Id: " + rentalsId + " was deleted successfully");
    }
}