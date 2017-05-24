package game.action.simple.repair;

import game.action.api.Action;
import game.places.store.Greenhouse;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class Repair implements Action {
    @Override
    public boolean isActionValid() {
        return Greenhouse.getInstance().permitAction(this);
    }

    @Override
    public void happen() {
        Greenhouse.getInstance().receiveAction(this);
    }

    @Override
    public String getName() {
        return getClass().getName();
    }
}
