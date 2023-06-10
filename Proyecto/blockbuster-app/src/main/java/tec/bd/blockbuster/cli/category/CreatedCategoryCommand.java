/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.category;


import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import tec.bd.Application;
import tec.bd.blockbuster.Category;
import tec.bd.blockbuster.cli.movie.CreatedMovieCommand;
import tec.bd.blockbuster.movie;


@Command(name = "catc", description = "Create Movies")

public class CreatedCategoryCommand implements Runnable {
  private final static Logger LOGGER = LoggerFactory.getLogger(CreatedMovieCommand.class);
  
  @CommandLine.Parameters(paramLabel = "<category name>", description = "Id od category")
    private String name;
  
  @CommandLine.Parameters(paramLabel = "<release_date>", description = "Category description")
    private String description;

    

    @Override
    public void run() {
        var blockbusterCategory = new Application().getBlockbusterCategory();

        //blockbusterCategory.addNewCategory(categoryId);

        System.out.println("Category: " + name + " was create successfully");
    }
   


    public Integer call() throws Exception {
        var category = new Category();
         //movie.setId(movieId);
         category.setName(name);
         category.setDescription(description);
        
 
   
            //LOGGER.error(e.getMessage(), e);
            return 1;
       
    }
}