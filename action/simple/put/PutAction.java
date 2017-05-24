package game.action.simple.put;

import game.action.api.ActionHandler;
import game.action.simple.SimpleAction;
import game.entities.Entity;
import game.entities.type.api.EntityType;
import game.entities.type.storage.AbstractStorage;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class PutAction extends SimpleAction {
    private final Entity entity;
    private final int value;
    private final AbstractStorage storage;

    public PutAction(Entity entity, int value, AbstractStorage storage) {
        this.entity = entity;
        this.value = value;
        this.storage = storage;
    }

    @Override
    public ActionHandler[] getActionInput() {
        return new ActionHandler[]{};
    }

    @Override
    public ActionHandler[] getActionOutput() {
        return new ActionHandler[]{storage};
    }

    public Entity getEntity() {
        return entity;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String getName() {
        return entity.toString() + " X" + value;
    }
}