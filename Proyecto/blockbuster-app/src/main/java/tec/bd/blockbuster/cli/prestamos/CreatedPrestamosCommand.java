/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.prestamos;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import tec.bd.Application;
import tec.bd.blockbuster.movie;
import tec.bd.blockbuster.rentals;

@Command(name = "loanc", description = "Create Prestamos")
public class CreatedPrestamosCommand implements Runnable {
 @CommandLine.Parameters(paramLabel = "<rental id>", description = "Id of rental")
    private int rentalId;

    @Override
    public void run() {
        var blockbuster = new Application().getBlockbusterRental();

        blockbuster.getRental(rentalId);

        System.out.println("Rental: " + rentalId + " was deleted successfully");
    }
}