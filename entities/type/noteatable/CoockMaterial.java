package game.entities.type.noteatable;

import game.entities.Entity;
import game.entities.type.api.EntityType;

/**
 * Created by AmirHosein on 5/24/2017.
 */
public class CoockMaterial implements Entity {
    private final EntityType type;

    public CoockMaterial(EntityType type) {
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
        return type.toString();
    }
}
