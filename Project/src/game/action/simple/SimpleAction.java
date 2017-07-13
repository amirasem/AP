package game.action.simple;

import game.action.api.Action;
import game.action.api.ActionHandler;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public abstract class SimpleAction implements Action {
    @Override
    public boolean isActionValid() {
        for (ActionHandler h : getActionInput()) if (!h.permitAction(this)) return false;
        return true;
    }

    protected abstract ActionHandler[] getActionInput();

    @Override
    public void happen() {
        for (ActionHandler h : getActionInput()) h.receiveAction(this);
        for (ActionHandler h : getActionOutput()) h.receiveAction(this);
    }

    protected abstract ActionHandler[] getActionOutput();
}
