package game.entities;

import game.animals.properties.Live;
import game.entities.type.eatable.api.EatableEntityType;

/**
 * Created by AmirHosein on 7/5/2017.
 * ASAY
 */
public class EatableEntity implements EatableEntityType {
    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void getEaten(Live live) {

    }

    @Override
    public String getStatus() {
        return null;
    }
}
