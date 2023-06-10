/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.prestamos;

import picocli.CommandLine.Command;
import tec.bd.Application;

@Command(name = "loanu", description = "Update Rentals")
public class UpdatePrestamosCommand implements Runnable {
    private String rentalOld;
    private String rentalNew;

    @Override
    public void run() {
        var blockbusterPrestamo = new Application().getBlockbusterRental();
        
        var category = blockbusterPrestamo.getRentalDate(rentalOld);
        

        blockbusterPrestamo.editRental(rentalOld, rentalNew);

        System.out.println("New Category: " + rentalNew + " was modified successfully");
    
    
    }

}
