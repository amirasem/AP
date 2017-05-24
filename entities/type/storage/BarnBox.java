package game.entities.type.storage;

import game.entities.Entity;
import ui.UI;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
class BarnBox extends AbstractStorage {

    BarnBox(int capacity) {
        super(capacity);
    }

    @Override
    public boolean hasCapacityFor(Entity entityType, int value) {
        return false;
    }

    @Override
    public UI getUI() {
        return null;
    }
}
