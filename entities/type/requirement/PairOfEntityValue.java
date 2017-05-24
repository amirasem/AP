package game.entities.type.requirement;


import game.entities.Entity;

/**
 * Created by ahay on 4/19/17.
 * GIBILI GIBILI
 */
public class PairOfEntityValue {
    private final Entity entity;
    private final int value;

    public PairOfEntityValue(Entity entity, int value) {
        this.entity = entity;
        this.value = value;
    }

    public Entity getEntity() {
        return entity;
    }

    public int getValue() {
        return value;
    }
}
