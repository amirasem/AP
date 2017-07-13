package game.entities.type.storage;

import game.action.api.Action;
import game.action.api.ActionHandler;
import game.action.simple.put.PutMoneyAction;
import game.action.simple.take.TakeMoneyAction;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class Wallet  implements ActionHandler {
    private final static int INITIAL_MONEY = 10000;
    private static Wallet ourInstance = new Wallet();

    public static Wallet getInstance() {
        return ourInstance;
    }

    private int money;

    private Wallet() {
        money = INITIAL_MONEY;
    }

    @Override
    public boolean permitAction(Action action) {
        if (action.getClass().equals(PutMoneyAction.class)) return true;
        if (action.getClass().equals(TakeMoneyAction.class)) return permitTake((TakeMoneyAction) action);
        return false;
    }

    private boolean permitTake(TakeMoneyAction action) {
        return money >= action.getValue();
    }

    private void put(PutMoneyAction action) {
        money += action.getValue();
    }


    @Override
    public void receiveAction(Action action) {
        if (action.getClass().equals(PutMoneyAction.class)) put((PutMoneyAction) action);
        if (action.getClass().equals(TakeMoneyAction.class)) take((TakeMoneyAction) action);

    }

    private void take(TakeMoneyAction action) {
        money -= action.getValue();
    }
}
