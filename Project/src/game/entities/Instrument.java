package game.entities;

import game.entities.type.api.EntityType;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class Instrument implements Entity {
    private final EntityType type;

    public Instrument(EntityType type) {
        this.type = type;
    }

    @Override
    public EntityType getType() {
        return type;
    }

    @Override
    public String getStatus() {
        return getType().getStatus();
    }

    @Override
    public String toString() {
        return type.getClass().getSimpleName() + " " + type;
    }
}
