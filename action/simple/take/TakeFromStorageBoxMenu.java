package game.action.simple.take;

import game.entities.type.requirement.PairOfEntityValue;
import game.entities.type.storage.StorageBox;
import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.entities.TakeFromStorageBoxMenuUI;

/**
 * Created by ahay on 5/6/17.
 * <p>
 * GIBILI GIBILI
 */
public class TakeFromStorageBoxMenu extends AbstractInteractable {

    @Override
    public UI getUI() {
        actions.clear();
//        for (PairOfEntityValue p : StorageBox.getInstance().getStoredItems())
//            addAction(new TakeAction(p.getEntityType(), p.getValue(), StorageBox.getInstance()));
//        System.out.println("------------------>" + actions.size());
        return new TakeFromStorageBoxMenuUI(this);
    }
}
