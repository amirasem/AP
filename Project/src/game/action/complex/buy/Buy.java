package game.action.complex.buy;

import game.action.api.Action;
import game.action.complex.ComplexAction;
import game.entities.Entity;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class Buy extends ComplexAction {
    static Action[] generateActions(Entity entity, int money, int count) {
        Action[] l = new Action[count];
        for (int i = 0; i < count; i++) l[i] = new SimpleBuy(entity, money);
        return l;
    }

    public Buy(Entity entity, int money, int count) {
        super(generateActions(entity, money, count));
    }
}
