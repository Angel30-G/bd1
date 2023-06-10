/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.category;

import picocli.CommandLine.Parameters;
import picocli.CommandLine.Command;

import java.util.List;
import tec.bd.Application;
import tec.bd.Blockbuster;
import tec.bd.BlockbusterCategory;
import tec.bd.blockbuster.Category;
import tec.bd.blockbuster.movie;

@Command(name = "catr", description = "Get All Categories")
public class GetCategoryCommand implements Runnable {

    @Parameters(paramLabel = "<category id>", description = "Id of Category", defaultValue = "0")
    private int categoryId;

    @Override
    public void run() {

        System.out.println("categoryId: " + categoryId);
        BlockbusterCategory blockbusterCategory = new Application().getBlockbusterCategory();

        if (categoryId != 0) {
            // La logica encontrar por movieId
            System.out.println("=== Get Category Id === ");
            var category = blockbusterCategory.getCategory(categoryId);

            System.out.println("Category: "+ category.getName() + ", Descripcion: " + category.getDescription());

        } else {

            System.out.println("=== Get All Categories === ");

            List<Category> category = blockbusterCategory.getAllCategory();

            System.out.println("Codigo \t\t Category");
            for (Category m : category) {
                System.out.println(m.getName() + "\t\t" + m.getDescription());
            }

        }
    }

}
