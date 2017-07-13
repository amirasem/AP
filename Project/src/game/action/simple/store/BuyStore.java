package game.action.simple.store;

import game.entities.Entity;
import game.interactable.Interactable;

import java.util.ArrayList;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public abstract class BuyStore extends StoreAction {
    private static Interactable instance;

    public BuyStore(ArrayList<? extends Entity> list) {
        super(list);
    }

    public static Interactable getInstance() {
        return instance;
    }

    @Override
    public boolean isActionValid() {
        return false;
    }

    @Override
    public String getName() {
        return "Buy an item";
    }
}
