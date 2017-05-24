package game.entities.type.eatable.api;

import game.animals.properties.Live;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public abstract class AnimalProduct implements EatableEntityType {
    @Override
    public void getEaten(Live live) {
        return;
    }
}
