package game.action.simple.store.workshop;

import game.entities.Eatable;
import game.entities.Instrument;
import game.entities.type.eatable.Foods;
import game.entities.type.eatable.Fruit;
import game.entities.type.instrument.api.Tool;
import game.entities.type.instrument.cook.CookTool;
import game.entities.type.instrument.farm.*;

import java.util.ArrayList;

/**
 * Created by AmirHosein on 5/24/2017.
 */
public class WorkshopHelper {
    static ArrayList<Instrument> getList() {
        ArrayList<Instrument> l = new ArrayList<>();
        for (Axe f : Axe.values()) l.add(new Instrument(f));
        for (FishingRod f : FishingRod.values()) l.add(new Instrument(f));
        for (Pick f : Pick.values()) l.add(new Instrument(f));
        for (Shovel f : Shovel.values()) l.add(new Instrument(f));
        for (Sprinkler f : Sprinkler.values()) l.add(new Instrument(f));
        for (CookTool f : CookTool.values()) l.add(new Instrument(f));
        return l;
    }

}
