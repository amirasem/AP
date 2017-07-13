package game.action.simple.put;

import game.action.api.ActionHandler;
import game.action.simple.SimpleAction;
import game.entities.type.storage.Wallet;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class PutMoneyAction extends SimpleAction {
    private final int value;

    public PutMoneyAction(int value) {
        this.value = value;
    }

    @Override
    protected ActionHandler[] getActionInput() {
        return new ActionHandler[]{};
    }

    @Override
    protected ActionHandler[] getActionOutput() {
        return new ActionHandler[]{Wallet.getInstance()};
    }

    public int getValue() {
        return value;
    }


    @Override
    public String getName() {
        return getClass().getName();
    }
}
