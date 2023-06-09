/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.category;


import picocli.CommandLine;
import picocli.CommandLine.Command;
import tec.bd.Application;
import tec.bd.blockbuster.Category;
import tec.bd.blockbuster.movie;

@Command(name = "catc", description = "Create Movies")

public class CreatedCategoryCommand implements Runnable {
    @CommandLine.Parameters(paramLabel = "<category id>", description = "Id of category")
    private Category categoryId;

    

    @Override
    public void run() {
        var blockbusterCategory = new Application().getBlockbusterCategory();

        blockbusterCategory.addNewCategory(categoryId);

        System.out.println("Category: " + categoryId + " was deleted successfully");
    }
}