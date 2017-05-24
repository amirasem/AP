package game.entities.type.eatable.api;

import game.animals.properties.Live;
import game.entities.type.api.EntityType;

/**
 * Created by ahay on 4/19/17.
 * GIBILI GIBILI
 */
public interface EatableEntityType extends EntityType {
    public void getEaten(Live live);

    public String getStatus();
}
