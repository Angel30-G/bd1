/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster.cli;

import picocli.CommandLine.Command;
import picocli.CommandLine.HelpCommand;
import tec.bd.blockbuster.cli.category.CreatedCategoryCommand;
import tec.bd.blockbuster.cli.category.DeleteCategoryCommand;
import tec.bd.blockbuster.cli.category.GetCategoryCommand;
import tec.bd.blockbuster.cli.category.UpdateCategoryCommand;
import tec.bd.blockbuster.cli.movie.*;

@Command(
        name = "blockbuster-app",
        subcommands = {
                GetCategoryCommand.class,
                //GetByTittleCommand.class,
                CreatedCategoryCommand.class,
                DeleteCategoryCommand.class,
                UpdateCategoryCommand.class,
                HelpCommand.class
        },
        description = "Manage Category")
public class commandCategory implements Runnable {

    @Override
    public void run() {

    }
}
