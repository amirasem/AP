package game.action.complex.buy;

import game.action.api.Action;
import game.action.simple.put.PutAction;
import game.action.simple.take.TakeMoneyAction;
import game.entities.type.eatable.AnimalFoods;
import game.entities.type.living.Farmer;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
//TODO : class : private final String name : add to constructor
public enum BuyAnimalFoodAction implements Action {
    BUY_FOOD_ALFALFA(100),
    BUY_FOOD_SEED(100),;

    private final Action[] actions;
    private final int money;

    BuyAnimalFoodAction(int money) {
        this.money = money;
        actions = new Action[2];
        AnimalFoods animalFoods = BuyHelperName.getInstance().getAnimalFood(name());
        if (animalFoods != null) {
            actions[0] = new TakeMoneyAction(money);
//            actions[1] = new PutAction(animalFoods, 1, Farmer.getInstance().getBackpack());
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
