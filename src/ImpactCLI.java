import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Help.Ansi;

@Command(name = "impact", mixinStandardHelpOptions = true, version = "1.0",
        description = "Prints the name of the company")
public class ImpactCLI implements Runnable {

    @Override
    public void run() {
        System.out.println("");
        System.out.println(" Java CLI Application specially designed for:\n");

        String ascii = Ansi.AUTO.string(
            "@|fg(red)  /$$                                               /$$      |@\n" +
            "@|fg(red) |__/                                              | $$      |@\n" +
            "@|fg(red)  /$$ /$$$$$$/$$$$   /$$$$$$   /$$$$$$   /$$$$$$$ /$$$$$$    |@\n" +
            "@|fg(red) | $$| $$_  $$_  $$ /$$___ $$ |____  $$ /$$_____/|_  $$_/    |@\n" +
            "@|fg(red) | $$| $$  \\$$  \\$$  $$   |$$  /$$$$$$$| $$        | $$      |@\n" +
            "@|fg(red) | $$| $$ | $$ | $$| $$ __|$$ /$$__  $$| $$        | $$ /$$  |@\n" +
            "@|fg(red) | $$| $$ | $$ | $$| $$$$$$$/|  $$$$$$$|  $$$$$$$  | $$$$/   |@\n" +
            "@|fg(red) |__/|__/ |__/ |__/| $$____/  \\_______/ \\_______/   \\___/    |@\n" +
            "@|fg(red)                   | $$                                     |@\n" +
            "@|fg(red)                   | $$                             ▛▘▛▌▛▛▌     |@\n" +
            "@|fg(red)                   |__/                           ▗ ▙▖▙▌▌▌▌     |@\n"
        );

        System.out.println(ascii);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ImpactCLI()).execute(args);
        System.exit(exitCode);
    }
}