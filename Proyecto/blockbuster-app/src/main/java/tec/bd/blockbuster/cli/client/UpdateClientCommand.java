/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.client;

import picocli.CommandLine.Command;
import tec.bd.Application;

@Command(name = "cliu", description = "Update Client")
public class UpdateClientCommand implements Runnable {
    private String clientOld;
    private String clientNew;

    @Override
    public void run() {
        var blockbusterClient = new Application().getBlockbusterClient();
        
        var category = blockbusterClient.getClient(clientOld);
        

        blockbusterClient.editClientName(clientOld, clientNew);

        System.out.println("New Category: " + clientNew + " was modified successfully");
    
    
    }

}