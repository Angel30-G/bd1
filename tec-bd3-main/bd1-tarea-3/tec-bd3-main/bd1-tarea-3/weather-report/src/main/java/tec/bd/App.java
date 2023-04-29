package tec.bd;

import picocli.CommandLine;
import tec.bd.cli.MainCommand;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "==> Bienvenido al programa Weather Report\nUtiliza los siguientes comandos para navegar" +
                "y utilizar las funcionalidades de Weather Report:");

        CommandLine cmd = new CommandLine(new MainCommand());
        cmd.setExecutionStrategy(new CommandLine.RunAll()); // default is RunLast
        cmd.execute(args);

        if (args.length == 0) { cmd.usage(System.out); }
    }
}
