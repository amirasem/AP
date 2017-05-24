package game.action.simple.store.kitchen;

import game.entities.Eatable;
import game.entities.type.eatable.Foods;
import game.entities.type.eatable.Fruit;

import java.util.ArrayList;

/**
 * Created by AmirHosein on 5/24/2017.
 */
public class KitchenHelper {
    static ArrayList<Eatable> getList() {
        ArrayList<Eatable> l = new ArrayList<>();
        for (Foods f : Foods.values()) l.add(new Eatable(f));
        return l;
    }

}
