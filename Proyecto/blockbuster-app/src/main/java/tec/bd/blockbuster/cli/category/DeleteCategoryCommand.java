/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli.category;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import tec.bd.Application;
import tec.bd.blockbuster.ApplicationContext;

@Command(name = "catd", description = "Delete Category")
public class DeleteCategoryCommand implements Runnable {

    @CommandLine.Parameters(paramLabel = "<category id>", description = "Id of category")
    private long categoryId;

    @Override
    public void run() {
        var blockbuster = new Application().getBlockbuster();

        blockbuster.remove(categoryId);

        System.out.println("Category: " + categoryId + " was deleted successfully");
    }
}
