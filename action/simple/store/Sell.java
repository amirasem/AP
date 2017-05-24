package game.action.simple.store;

import game.entities.Entity;

import java.util.ArrayList;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class Sell extends StoreAction {
    public Sell(ArrayList<Entity> list) {
        super(list);
    }

    @Override
    public boolean isActionValid() {
        return false;
    }

    @Override
    public void happen() {

    }

    @Override
    public String getName() {
        return null;
    }
}
