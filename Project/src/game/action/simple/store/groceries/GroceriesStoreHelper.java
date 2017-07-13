package game.action.simple.store.groceries;

import game.entities.Eatable;
import game.entities.type.eatable.Foods;
import game.entities.type.eatable.Fruit;

import java.util.ArrayList;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
class GroceriesStoreHelper {
    static ArrayList<Eatable> getList() {
        ArrayList<Eatable> l = new ArrayList<>();
        for (Fruit f : Fruit.values()) l.add(new Eatable(f));
        for (Foods f : Foods.values()) l.add(new Eatable(f));
        return l;
    }
}
