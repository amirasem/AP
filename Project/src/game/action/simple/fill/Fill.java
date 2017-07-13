package game.action.simple.fill;

import game.action.simple.take.TakeAction;
import game.entities.type.requirement.PairOfEntityValue;
import game.entities.type.storage.Backpack;
import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.FillUI;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class Fill extends AbstractInteractable {
    @Override
    public UI getUI() {
        actions.clear();
        for (PairOfEntityValue p : Backpack.getInstance().getStoredItems())
           addAction(new TakeAction(p.getEntity(), p .getValue(), Backpack.getInstance()));
        return new FillUI(this);
    }
}
