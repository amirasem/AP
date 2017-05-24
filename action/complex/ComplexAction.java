package game.action.complex;

import game.action.api.Action;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class ComplexAction implements Action {
    protected final Action[] actions;

    protected ComplexAction(Action... actions) {
        this.actions = actions;
    }

    @Override
    public boolean isActionValid() {
        for (Action a : actions)
            if (!a.isActionValid()) return false;
        return true;
    }

    @Override
    public void happen() {
        for (Action a : actions) a.happen();
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
