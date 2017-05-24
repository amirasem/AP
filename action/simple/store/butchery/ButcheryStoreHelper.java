package game.action.simple.store.butchery;

import game.entities.Entity;
import game.entities.type.noteatable.CoockMaterial;
import game.entities.type.noteatable.RawMaterialCooking;

import java.util.ArrayList;

/**
 * Created by AmirHosein on 5/24/2017.
 */
public class ButcheryStoreHelper {
    static ArrayList<Entity> getList() {
        ArrayList<Entity> l = new ArrayList<>();
        for (RawMaterialCooking p : RawMaterialCooking.values()) l.add(new CoockMaterial(p));
        return l;
    }
}
