package game.action.simple.store.ranch;

import game.action.simple.store.StoreAction;
import game.entities.Entity;
import game.interactable.Interactable;
import game.places.store.Ranch;

import java.util.ArrayList;

/**
 * Created by AmirHosein on 7/5/2017.
 * ASAY
 */
public  abstract class RanchBuyStore extends StoreAction {
    private static Interactable instance;

    public RanchBuyStore(ArrayList<? extends Entity> list) {
        super(list);
    }

    public static Interactable getInstance() {
        return instance;
    }

    @Override
    public boolean isActionValid() {
        return false;
    }
    @Override
    public String getName() {
        return "Buy an animal";
    }
}
