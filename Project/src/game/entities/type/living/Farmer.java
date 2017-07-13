package game.entities.type.living;

import game.action.api.Action;
import game.action.api.ActionHandler;
import game.entities.type.storage.Backpack;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class Farmer implements ActionHandler {
    private static Farmer ourInstance = new Farmer();
    private final Backpack backpack;

    public static Farmer getInstance() {
        return ourInstance;
    }

    private Farmer() {
        backpack = null;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    @Override
    public boolean permitAction(Action action) {
        return false;
    }

    @Override
    public void receiveAction(Action action) {
    }
}
