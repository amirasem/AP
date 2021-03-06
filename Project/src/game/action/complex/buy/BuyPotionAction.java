package game.action.complex.buy;

import game.action.api.Action;
import game.action.simple.put.PutAction;
import game.action.simple.take.TakeMoneyAction;
import game.entities.type.eatable.Potion;
import game.entities.type.living.Farmer;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public enum BuyPotionAction implements Action {
    BUY_POTION_ANIMAL(100),
    BUY_POTION_HUMAN(100),;

    private final Action[] actions;
    private final int money;

    BuyPotionAction(int money) {
        this.money = money;
        actions = new Action[2];
        Potion potion = BuyHelperName.getInstance().getPotion(name());
        if (potion != null) {
            actions[0] = new TakeMoneyAction(money);
//            actions[1] = new PutAction(potion , 1, Farmer.getInstance().getBackpack());
        }
    }

    @Override
    public boolean isActionValid() {
        return false;
    }

    @Override
    public void happen() {

    }


    @Override
    public String getName() {
        return name();
    }
}
