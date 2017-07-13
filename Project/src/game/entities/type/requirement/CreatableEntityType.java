package game.entities.type.requirement;

import game.entities.type.api.EntityType;

/**
 * Created by ahay on 4/19/17.
 * GIBILI GIBILI
 */
public interface CreatableEntityType extends EntityType {
    public boolean canBeCreatedBy(Requirements ... requirements);
}
