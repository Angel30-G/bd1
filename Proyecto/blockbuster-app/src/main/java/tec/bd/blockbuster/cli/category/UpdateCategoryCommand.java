/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.category;

import picocli.CommandLine.Command;
import tec.bd.Application;
import tec.bd.blockbuster.Category;

@Command(name = "catu", description = "Update Category")
public class UpdateCategoryCommand implements Runnable {
    private String categoryOld;
    private String categoryNew;

    @Override
    public void run() {
        var blockbusterCategory = new Application().getBlockbusterCategory();
        
        var category = blockbusterCategory.getCategoryNombre(categoryOld);
        

        blockbusterCategory.editCategory(categoryOld, categoryNew);

        System.out.println("New Category: " + categoryNew + " was deleted successfully");
    
    
    }

}
