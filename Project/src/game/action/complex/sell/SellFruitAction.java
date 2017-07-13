package game.action.complex.sell;

import game.action.api.Action;
import game.action.simple.put.PutMoneyAction;
import game.action.simple.take.TakeAction;
import game.entities.type.eatable.Fruit;
import game.entities.type.living.Farmer;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public enum SellFruitAction implements Action {
    SELL_FRUIT_PEAR(100),
    SELL_FRUIT_PEACH(100),
    SELL_FRUIT_EGGPLANT(100),
    SELL_FRUIT_LETTUCE(100),
    SELL_FRUIT_GAERLIC(100),
    SELL_FRUIT_PEAS(100),

    SELL_FRUIT_POMEGRANATA(100),
    SELL_FRUIT_LEMON(100),
    SELL_FRUIT_CUCUMBERS(100),
    SELL_FRUIT_WATERMELON(100),
    SELL_FRUIT_TURNIP(100),

    SELL_FRUIT_ORANGE(100),
    SELL_FRUIT_APPLE(100),
    SELL_FRUIT_ONION(100),
    SELL_FRUIT_POTATO(100),
    SELL_FRUIT_CARROT(100),
    SELL_FRUIT_TOMATO(100),
    SELL_FRUIT_MELON(100),

    SELL_FRUIT_PINEAPPLE(100),
    SELL_FRUIT_STRAWBERRY(100),
    SELL_FRUIT_PAPER(100),;
    private final Action[] actions;
    private final int money;

    SellFruitAction(int money) {
        this.money = money;
        actions = new Action[2];
        Fruit fruit = SellHelperName.getInstance().getFruit(name());
        if (fruit != null) {
            actions[0] = new PutMoneyAction(money);
//            actions[1] = new TakeAction(fruit, 1, Farmer.getInstance().getBackpack());
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
