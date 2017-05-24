package game.entities;

import game.entities.type.api.EntityType;
import game.entities.type.eatable.api.EatableEntityType;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class Eatable implements Entity {
    private final EatableEntityType type;

    public Eatable(EatableEntityType type) {
        this.type = type;
    }

    @Override
    public EntityType getType() {
        return type;
    }

    @Override
    public String getStatus() {
        return type.getStatus();
    }

    @Override
    public String toString() {
        return "" + type.toString();
    }
}
