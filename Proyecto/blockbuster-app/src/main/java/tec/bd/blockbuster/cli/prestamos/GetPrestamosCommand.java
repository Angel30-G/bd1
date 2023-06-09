/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.prestamos;

import picocli.CommandLine.Parameters;
import picocli.CommandLine.Command;

import java.util.List;
import tec.bd.Application;
import tec.bd.Blockbuster;
import tec.bd.BlockbusterClient;
import tec.bd.BlockbusterRental;
import tec.bd.blockbuster.movie;
import tec.bd.blockbuster.rentals;

@Command(name = "loanr", description = "Get All Rentals")
public class GetPrestamosCommand implements Runnable {

    @Parameters(paramLabel = "<Rentals id>", description = "Id of Rentals", defaultValue = "0")
    private long rentalId;

    @Override
    public void run() {

        System.out.println("rentalsId: " + rentalId);
        BlockbusterRental blockbuster = new Application().getBlockbusterRental();

        if (rentalId != 0) {
            // La logica encontrar por movieId
            System.out.println("=== Get Rentals Id === ");
            var rental = blockbuster.getRental(rentalId);

            System.out.println("Date: "+ rental.getRental_date() + ", Id: " + rental.getId());

        } else {

            System.out.println("=== Get All Rentals === ");

            List<rentals> rental = blockbuster.getAllRental();

            System.out.println("Codigo \t\t Date");
            for (rentals m : rental) {
                System.out.println(m.getId() + "\t\t" + m.getRental_date());
            }

        }
    }

}