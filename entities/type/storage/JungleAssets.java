package game.entities.type.storage;

import game.entities.Entity;
import game.entities.type.material.RockMetal;
import ui.UI;

import java.util.Random;

/**
 * Created by Amir on 5/10/2017.
 * AHAY
 */
public class JungleAssets extends AbstractStorage {
    protected JungleAssets(int capacity) {
        super(capacity);
    }

    private void randomize() {
        clear();
        Random random = new Random();
//        for (RockMetal r : RockMetal.values()) if (random.nextBoolean()) put(r, random.nextInt(10) + 1);
    }

    @Override
    public UI getUI() {
        randomize();
        return null;
    }

    @Override
    public boolean hasCapacityFor(Entity entityType, int value) {
        return true;
    }
}
