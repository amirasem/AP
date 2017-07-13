package game.entities.type.storage;

import game.entities.Entity;
import ui.UI;
import ui.interactable.entities.BackpackUI;

/**
 * Created by ahay on 5/6/17.
 * <p>
 * GIBILI GIBILI
 */
public class Backpack extends AbstractStorage {
    private static Backpack ourInstance = new Backpack();

    public static Backpack getInstance() {
        return ourInstance;
    }

    private Backpack() {
        super(1500);
    }

    @Override
    public UI getUI() {
        return new BackpackUI(this);
    }

    @Override
    public boolean hasCapacityFor(Entity entityType, int value) {
        return value <= 1500;
    }
}
