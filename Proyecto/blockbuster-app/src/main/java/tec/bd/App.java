package tec.bd;

import picocli.CommandLine;
import tec.bd.blockbuster.cli.MainCommand;
import tec.bd.blockbuster.cli.commandCategory;
import tec.bd.blockbuster.cli.commandClient;
import tec.bd.blockbuster.cli.commandLog;
import tec.bd.blockbuster.cli.commandPrestamo;
import tec.bd.blockbuster.cli.commandReview;

public class App {

    public static void main(String... args) {


        CommandLine cmd = new CommandLine(new MainCommand());
        cmd.setExecutionStrategy(new CommandLine.RunAll()); // default is RunLast
        cmd.execute(args);

        if (args.length == 0) { cmd.usage(System.out); }
        
        CommandLine cmd2 = new CommandLine(new commandCategory());
        cmd2.setExecutionStrategy(new CommandLine.RunAll()); // default is RunLast
        cmd2.execute(args);

        if (args.length == 0) { cmd.usage(System.out); }
        
        CommandLine cmd3 = new CommandLine(new commandClient());
        cmd3.setExecutionStrategy(new CommandLine.RunAll()); // default is RunLast
        cmd3.execute(args);

        if (args.length == 0) { cmd.usage(System.out); }
        
        CommandLine cmd4 = new CommandLine(new commandPrestamo());
        cmd4.setExecutionStrategy(new CommandLine.RunAll()); // default is RunLast
        cmd4.execute(args);

        if (args.length == 0) { cmd.usage(System.out); }
        
         CommandLine cmd5 = new CommandLine(new commandReview());
        cmd5.setExecutionStrategy(new CommandLine.RunAll()); // default is RunLast
        cmd5.execute(args);

        if (args.length == 0) { cmd.usage(System.out); }
        
      /*  CommandLine cmd6 = new CommandLine(new commandLog());
        cmd6.setExecutionStrategy(new CommandLine.RunAll()); // default is RunLast
        cmd6.execute(args);

        if (args.length == 0) { cmd.usage(System.out); }*/

//       System.out.println("Blockbuster");
//
//        ApplicationContext appContext = new ApplicationContext();
//        Blockbuster blockbuster = appContext.getBlockbuster();
//        List<Movie> movies = blockbuster.getAllMovies();
//        System.out.println("Codigo \t\t Titulo");
//        for(Movie m : movies) {
//            System.out.println(m.getMovieId() +"\t\t" + m.getTitle());
//        }



    }

}
