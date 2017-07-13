package game.action.complex.buy;

import game.action.complex.ComplexAction;
import game.action.simple.put.PutAction;
import game.action.simple.take.TakeMoneyAction;
import game.entities.Entity;
import game.entities.type.storage.Backpack;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class SimpleBuy extends ComplexAction {
    public SimpleBuy(Entity entity, int money) {
        super(new PutAction(entity, 1, Backpack.getInstance()),
                new TakeMoneyAction(money));
    }
}
