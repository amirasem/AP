package game.entities.type.storage;

import game.entities.Entity;
import ui.UI;
import ui.interactable.entities.StorageBoxUI;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class StorageBox extends AbstractStorage {
    private static StorageBox ourInstance = new StorageBox();

    public static StorageBox getInstance() {
        return ourInstance;
    }

    private StorageBox() {
        super(Integer.MAX_VALUE);
    }

    @Override
    public boolean hasCapacityFor(Entity entityType, int value) {
        return true;
    }

//    public void putInItem() {
//        return;
//    }

//    public void takeOutItem() {
//        return;
//    }

    @Override
    public UI getUI() {
        return new StorageBoxUI();
    }
}
