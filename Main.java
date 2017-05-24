package ui;

import game.main.Game;
import ui.command.CommandLineHelper;

/**
 * Created by ahay on 5/1/17.
 * GIBILI GIBILI
 */
public class Main {
    public static void main(String[] args) {
        Game.getInstance().initiate();
        CommandLineHelper.getInstance().run();
    }
}
