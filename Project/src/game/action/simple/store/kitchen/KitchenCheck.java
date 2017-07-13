package game.action.simple.store.kitchen;

import game.action.simple.store.Check;

/**
 * Created by AmirHosein on 5/24/2017.
 */
public class KitchenCheck extends Check {
    public KitchenCheck() {
        super(KitchenHelper.getList());
    }

    @Override
    public String getName() {
        return "Check a Meal";
    }
}
