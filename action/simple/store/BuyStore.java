package game.action.simple.store;

import game.entities.Entity;

import java.util.ArrayList;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public abstract class BuyStore extends StoreAction {
    public BuyStore(ArrayList<? extends Entity> list) {
        super(list);
    }

    @Override
    public boolean isActionValid() {
        return false;
    }

    @Override
    public String getName() {
        return "BuyStore an item";
    }
}
