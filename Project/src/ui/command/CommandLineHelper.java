package ui.command;

import game.main.Game;

import java.util.Scanner;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public class CommandLineHelper {
    private static CommandLineHelper ourInstance = new CommandLineHelper();

    public static CommandLineHelper getInstance() {
        return ourInstance;
    }

    private final Scanner scanner = new Scanner(System.in);

    public String next() {
        return scanner.next();
    }

    public int nextInt() {
        return scanner.nextInt();
    }

    public String nextLine() {
        String out = scanner.nextLine();
        while (out.charAt(0) == ' ') out = out.substring(1);
        return out;
    }

    private CommandLineHelper() {
    }

    public void run() {
        while (true) run(next());
    }

    private Command findCommand(String command) {
        for (Command c : Command.values()) if (c.equalsCommand(command)) return c;
        return null;
    }

    private void run(String command) {
        Command c = findCommand(command);
        if (c != null) c.run();
        else try {
            Game.getInstance().getUIObject().getUI().run(Integer.parseInt(command));
            Game.getInstance().show();
        } catch (Exception e) {

        }
    }
}
