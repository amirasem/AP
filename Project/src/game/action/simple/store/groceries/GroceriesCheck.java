package game.action.simple.store.groceries;

import game.action.simple.store.Check;
import game.entities.Entity;

import java.util.ArrayList;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class GroceriesCheck extends Check{
    public GroceriesCheck() {
        super(GroceriesStoreHelper.getList());
    }
}
