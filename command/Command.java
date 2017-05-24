package ui.command;

import game.action.simple.picker.BackPackPicker;
import game.main.Game;
import ui.UIObject;

/**
 * Created by Amir on 5/14/2017.
 * AHAY
 */
public enum Command {
    BACKPACK("Backpack") {
        @Override
        void run() {
            new BackPackPicker().print();
        }
    }, BACK("Back") {
        @Override
        void run() {
            Game.getInstance().back();
        }
    },
    HELP("Help") {
        @Override
        void run() {
//TODO: Later
        }
    },
    WHERE_AM_I("WhereAmI") {
        @Override
        void run() {
//            TODO: Not Working Exactly
            Game.getInstance().setUIObject(Game.getInstance().getPlace());
            UIObject ui = Game.getInstance().getUIObject();
            ui.getUI().show();
        }
    }, GO_TO("GoTo") {
        @Override
        void run() {
            Game.getInstance().goTo(CommandLineHelper.getInstance().next());
//            TODO: Delete line below
//            WHERE_AM_I.run();
        }
    }, INSPECT("Inspect") {
        @Override
        void run() {
            Game.getInstance().inspect(CommandLineHelper.getInstance().nextLine());
        }
    };
    private final String command;

    Command(String command) {
        this.command = command;
    }

    abstract void run();

    public boolean equalsCommand(String command) {
        return this.command.equals(command);
    }
}
