package game.action.complex;

import game.action.simple.put.PutAction;
import game.action.simple.take.TakeAction;
import game.entities.type.api.EntityType;
import game.entities.type.storage.AbstractStorage;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class Transfer extends ComplexAction {
    public Transfer(AbstractStorage source, AbstractStorage terminal, EntityType entityType, int value) {
//        super(new PutAction(entityType, value, terminal), new TakeAction(entityType, value, source));
    }
}
