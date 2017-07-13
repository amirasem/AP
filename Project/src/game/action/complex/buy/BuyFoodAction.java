package game.action.complex.buy;

import game.action.api.Action;
import game.action.simple.put.PutAction;
import game.action.simple.take.TakeMoneyAction;
import game.entities.type.eatable.Foods;
import game.entities.type.living.Farmer;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public enum  BuyFoodAction implements Action {
    BUY_FOOD_MIRZAGHASEMI(100),
    BUY_FOOD_SHIRAZISALAD(100),
    BUY_FOOD_CHEESECAKE(100),
    BUY_FOOD_FRENCHFRISE(100111),
;
    private final Action[] actions;
    private final int money ;

    BuyFoodAction(int money)
    {
        this.money = money;
        Foods foods = BuyHelperName.getInstance().getFoods(name());
        actions = new Action[2];
        if(foods!=null)
        {
            actions[0] = new TakeMoneyAction(money);
//            actions[1] = new PutAction(foods,1, Farmer.getInstance().getBackpack());
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
