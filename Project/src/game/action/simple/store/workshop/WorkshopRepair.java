package game.action.simple.store.workshop;

import game.action.simple.store.StoreAction;
import game.entities.Entity;

import java.util.ArrayList;

/**
 * Created by AmirHosein on 7/5/2017.
 * ASAY
 */
public class WorkshopRepair extends StoreAction {
//TODO : IN kelas kamel shavad
    protected WorkshopRepair(ArrayList<? extends Entity> list) {
        super(list);
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
        return null;
    }
}
