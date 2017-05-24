package game.action.simple.picker;

import game.entities.Entity;
import game.entities.type.requirement.PairOfEntityValue;
import game.entities.type.storage.AbstractStorage;
import game.entities.type.storage.Backpack;

import java.util.ArrayList;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class StoragePicker extends AbstractPicker<Entity> {
    static ArrayList<Entity> getList(AbstractStorage storage) {
        ArrayList<Entity> l = new ArrayList<>();
        for (PairOfEntityValue p : storage.getStoredItems()) l.add(p.getEntity());
        return l;
    }

    public StoragePicker(String title, AbstractStorage storage) {
        super(title, getList(storage));
    }
}
