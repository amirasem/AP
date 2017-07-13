package game.interactable;

import game.action.simple.take.TakeAction;
import game.entities.type.requirement.PairOfEntityValue;
import game.entities.type.storage.Backpack;
import ui.UI;
import ui.interactable.SellUI;

/**
 * Created by ahay on 5/6/17.
 * <p>
 * GIBILI GIBILI
 */
public class Sell extends AbstractInteractable {
    private static Sell ourInstance = new Sell();

    public static Sell getInstance() {
        return ourInstance;
    }

    public Sell() {
    }

    @Override
    public UI getUI() {
        actions.clear();
        for (int  i = 0 ;i<Backpack.getInstance().getStoredItems().size() ;i++) {
            //addAction(new TakeAction(p.getEntity(), p.getValue() , Backpack.getInstance()));
            System.out.println(i + ":" + Backpack.getInstance().getStoredItems().get(i).getEntity());
        }
        return new SellUI(this);
    }
}
