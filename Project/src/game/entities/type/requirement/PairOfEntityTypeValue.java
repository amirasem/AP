package game.entities.type.requirement;


import game.entities.type.api.EntityType;
import game.entities.type.api.EntityType2;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class PairOfEntityTypeValue {
    private final EntityType entity;
    private final int value;
    private EntityType2 type2 ;
    public PairOfEntityTypeValue(EntityType entity, int value) {
        this.entity = entity;
        this.value = value;
    }
    public PairOfEntityTypeValue(EntityType entity , EntityType2  type2 , int value)
    {
        this.entity = entity;
        this.type2 = type2;
        this.value = value;
    }

    public EntityType getEntity() {
        return entity;
    }

    public int getValue() {
        return value;
    }
    public EntityType2 getEntity2(){
        return type2;
    }

    @Override
    public String toString() {
        return getEntity().toString()  + getValue();
    }
}