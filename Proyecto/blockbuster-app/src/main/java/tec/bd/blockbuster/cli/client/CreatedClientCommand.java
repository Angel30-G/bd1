/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.client;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import tec.bd.Application;
import tec.bd.blockbuster.Category;
import tec.bd.blockbuster.clients;

@Command(name = "clic", description = "Create Client")
public class CreatedClientCommand implements Runnable {
    @CommandLine.Parameters(paramLabel = "<client id>", description = "Id of client")
    private clients clientId;


    @Override
    public void run() {
        var blockbusterClient = new Application().getBlockbusterClient();

        blockbusterClient.addNewClient(clientId);

        System.out.println("Category: " + clientId + " was deleted successfully");
    }
}
