package game.action.complex.sell;

import game.action.complex.ComplexAction;
import game.action.simple.put.PutMoneyAction;
import game.action.simple.take.TakeAction;
import game.entities.Entity;
import game.entities.type.api.EntityType;
import game.entities.type.storage.AbstractStorage;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class Sell extends ComplexAction {
    public Sell(Entity entityType, int value, AbstractStorage storage) {
        super(new TakeAction(entityType, 1, storage), new PutMoneyAction(value));
    }
}
