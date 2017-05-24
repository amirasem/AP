package game.entities.type.requirement;


import game.entities.type.api.EntityType;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class PairOfEntityTypeValue {
    private final EntityType entity;
    private final int value;

    public PairOfEntityTypeValue(EntityType entity, int value) {
        this.entity = entity;
        this.value = value;
    }

    public EntityType getEntity() {
        return entity;
    }

    public int getValue() {
        return value;
    }
}