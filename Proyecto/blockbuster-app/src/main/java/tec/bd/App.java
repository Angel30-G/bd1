package tec.bd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;
import tec.bd.blockbuster.cli.MainCommand;

public class App {
    private final static Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
        //BlockBuster App main
        LOGGER.debug("BlockBuster App: initializing... ");

        //Comandos
        CommandLine cmd = new CommandLine(new MainCommand());

        cmd.setExecutionStrategy(new CommandLine.RunAll());

        cmd.execute(args);

        if (args.length == 0) {

            cmd.usage(System.out);
        }
    }
}