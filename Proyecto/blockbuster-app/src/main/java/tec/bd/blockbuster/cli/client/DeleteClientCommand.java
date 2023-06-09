/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.client;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import tec.bd.Application;
import tec.bd.blockbuster.ApplicationContext;

@Command(name = "clid", description = "Delete Client")
public class DeleteClientCommand implements Runnable {

    @CommandLine.Parameters(paramLabel = "<Client id>", description = "Id of Client")
    private long clientId;

    @Override
    public void run() {
        var blockbusterClient = new Application().getBlockbusterClient();

        blockbusterClient.remove(clientId);

        System.out.println("Movie Id: " + clientId + " was deleted successfully");
    }
}