package com.impactcli;

/**
 * Impact CLI Application
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length == 0) {
            printUsage();
            return;
        }

        String command = args[0];
        
        switch (command) {
            case "hello":
                handleHello(args);
                break;
            case "version":
                handleVersion();
                break;
            case "help":
                printUsage();
                break;
            default:
                System.out.println("Unknown command: " + command);
                printUsage();
        }
    }

    private static void handleHello(String[] args) {
        if (args.length > 1) {
            System.out.println("Hello, " + args[1] + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }

    private static void handleVersion() {
        System.out.println("Impact CLI v1.0.0");
    }

    private static void printUsage() {
        System.out.println("Impact CLI - A simple Java command-line tool");
        System.out.println();
        System.out.println("Usage: impact-cli <command> [options]");
        System.out.println();
        System.out.println("Commands:");
        System.out.println("  hello [name]  - Print a greeting message");
        System.out.println("  version       - Print the version number");
        System.out.println("  help          - Show this help message");
    }
}
