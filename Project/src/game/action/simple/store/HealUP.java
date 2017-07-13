package game.action.simple.store;

import game.entities.Entity;
import game.interactable.Interactable;

import java.util.ArrayList;

/**
 * Created by AmirHosein on 7/5/2017.
 * ASAY
 */
public abstract class HealUP extends StoreAction  {
    private static Interactable instance;
    protected HealUP(ArrayList<? extends Entity> list) {
        super(list);
    }
    public static Interactable getInstance() {
        return instance;
    }

    @Override
    public boolean isActionValid() {
        return true;
    }

    @Override
    public String getName() {
        return "Heal up";
    }
}
