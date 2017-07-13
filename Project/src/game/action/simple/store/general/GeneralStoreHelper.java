package game.action.simple.store.general;

import game.entities.Eatable;
import game.entities.Instrument;
import game.entities.type.eatable.Foods;
import game.entities.type.eatable.Fruit;
import game.entities.type.instrument.farm.*;

import java.util.ArrayList;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
class GeneralStoreHelper {
    static ArrayList<Instrument> getList() {
        ArrayList<Instrument> l = new ArrayList<>();
        for (Shovel f : Shovel.values()) l.add(new Instrument(f));
        for (Pick f : Pick.values()) l.add(new Instrument(f));
        for (Axe f : Axe.values()) l.add(new Instrument(f));
        for (Sprinkler f : Sprinkler.values()) l.add(new Instrument(f));
        return l;
    }
}
