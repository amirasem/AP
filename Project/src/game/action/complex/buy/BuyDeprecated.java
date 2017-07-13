package game.action.complex.buy;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.BuyUI;

/**
 * Created by ahay on 5/6/17.
 * <p>
 * GIBILI GIBILI
 */
public class BuyDeprecated extends AbstractInteractable {
    private static BuyDeprecated ourInstance = new BuyDeprecated();

    public static BuyDeprecated getInstance() {
        return ourInstance;
    }

    public BuyDeprecated() {
    }

    @Override
    public UI getUI() {
        actions.clear();
//        for (PairOfEntityValue p : StorageBox.getInstance().getStoredItems())
//            addAction(new PutAction(p.getEntityType(), p.getValue(), Backpack.getInstance()));
        return new BuyUI(this);
    }
}
