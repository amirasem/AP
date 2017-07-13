package game.action.simple.drop;

import game.action.simple.put.PutAction;
import game.action.simple.take.TakeAction;
import game.entities.type.requirement.PairOfEntityValue;
import game.entities.type.storage.Backpack;
import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.entities.DropFromBackPackMenuUI;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class DropFromBackPackMenu extends AbstractInteractable {
    @Override
    public UI getUI() {
        actions.clear();
        for (PairOfEntityValue p : Backpack.getInstance().getStoredItems()) {
//            addAction(new TakeAction(p.getEntityType() , p.getValue() , Backpack.getInstance()));
//            addAction(new PutAction(p.getEntityType(),p.getValue(),null));
        }
        return new DropFromBackPackMenuUI(this);
    }
}
