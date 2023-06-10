/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import tec.bd.Application;
import tec.bd.blockbuster.Category;
import tec.bd.blockbuster.cli.movie.CreatedMovieCommand;
import tec.bd.blockbuster.clients;

@Command(name = "clic", description = "Create Client")
public class CreatedClientCommand implements Runnable {
    
   private final static Logger LOGGER = LoggerFactory.getLogger(CreatedMovieCommand.class);
  
  @CommandLine.Parameters(paramLabel = "<client name>", description = "Name of client")
    private String name;
  
  @CommandLine.Parameters(paramLabel = "<client lastname>", description = "Client lastname")
    private String lastname;
  
  @CommandLine.Parameters(paramLabel = "<client email>", description = "Client email")
    private String email;
  
  @CommandLine.Parameters(paramLabel = "<client phone_number>", description = "Client number")
    private int phone_number;


    @Override
    public void run() {
        var blockbusterClient = new Application().getBlockbusterClient();

        //blockbusterClient.addNewClient(phone_number);

        System.out.println("Client: " + name + " was create successfully");
    } 


    public Integer call() throws Exception {
        var clients = new clients();
         //movie.setId(movieId);
         clients.setName(name);
         clients.setLastname(lastname);
         clients.setEmail(email);
         clients.setPhone_number(phone_number);
 
   
            //LOGGER.error(e.getMessage(), e);
            return 1;
       
    }
}
