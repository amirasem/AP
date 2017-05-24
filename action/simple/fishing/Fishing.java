package game.action.simple.fishing;

import game.action.simple.take.TakeAction;
import game.entities.type.requirement.PairOfEntityValue;
import game.entities.type.storage.Backpack;
import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.FishingUI;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class Fishing extends AbstractInteractable {
    @Override
    public UI getUI() {
        actions.clear();
//        for (PairOfEntityValue p : Backpack.getInstance().getStoredItems())
//            addAction(new TakeAction(p.getEntityType(),p.getValue(), Backpack.getInstance()));
        return new FishingUI(this);
    }
}
