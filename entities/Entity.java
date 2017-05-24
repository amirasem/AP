package game.entities;

import game.entities.type.api.EntityType;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public interface Entity {
    public EntityType getType();

    public String getStatus();
}
