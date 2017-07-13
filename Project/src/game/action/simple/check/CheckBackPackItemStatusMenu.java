package game.action.simple.check;

import game.action.simple.put.PutAction;
import game.entities.type.requirement.PairOfEntityValue;
import game.entities.type.storage.Backpack;
import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.entities.CheckBackPackItemStatusMenuUI;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class CheckBackPackItemStatusMenu extends AbstractInteractable {
    @Override
    public UI getUI() {
        actions.clear();
//        for (PairOfEntityValue p : Backpack.getInstance().getStoredItems())
//            addAction(new PutAction(p.getEntityType(),p.getValue(), Backpack.getInstance()));
        return new CheckBackPackItemStatusMenuUI(this);
    }
}
