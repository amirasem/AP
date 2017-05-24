package game.action.simple.take;

import game.action.api.ActionHandler;
import game.action.simple.SimpleAction;
import game.entities.type.storage.Wallet;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class TakeMoneyAction extends SimpleAction {
    private final int value;

    public TakeMoneyAction(int value) {
        this.value = value;
    }

    @Override
    protected ActionHandler[] getActionInput() {
        return new ActionHandler[]{Wallet.getInstance()};
    }

    @Override
    protected ActionHandler[] getActionOutput() {
        return new ActionHandler[]{};
    }

    public int getValue() {
        return value;
    }


    @Override
    public String getName() {
        return getClass().getName();
    }
}
