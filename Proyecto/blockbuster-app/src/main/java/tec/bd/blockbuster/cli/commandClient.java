/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli;

import picocli.CommandLine.Command;
import picocli.CommandLine.HelpCommand;
import tec.bd.blockbuster.cli.client.CreatedClientCommand;
import tec.bd.blockbuster.cli.client.DeleteClientCommand;
import tec.bd.blockbuster.cli.client.GetClientCommand;
import tec.bd.blockbuster.cli.client.UpdateClientCommand;
import tec.bd.blockbuster.cli.movie.*;

@Command(
        name = "blockbuster-app",
        subcommands = {
                GetClientCommand.class,
                //GetClientCommand.class,
                CreatedClientCommand.class,
                DeleteClientCommand.class,
                UpdateClientCommand.class,
                HelpCommand.class
        },
        description = "Manage Clients")
public class commandClient implements Runnable {

    @Override
    public void run() {

    }
}
