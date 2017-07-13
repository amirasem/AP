package game.action.simple.collect;

import game.action.simple.take.TakeAction;
import game.entities.type.requirement.PairOfEntityValue;
import game.entities.type.storage.Backpack;
import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.entities.CollectWoodUI;

/**
 * Created by ahay on 5/8/17.
 * <p>
 * GIBILI GIBILI
 */
public class CollectWood extends AbstractInteractable {
    @Override
    public UI getUI() {
        actions.clear();
//        for (PairOfEntityValue p : Backpack.getInstance().getStoredItems())
//            addAction(new TakeAction(p.getEntityType(), p.getValue() , Backpack.getInstance()));
        return new CollectWoodUI(this);
    }
}
