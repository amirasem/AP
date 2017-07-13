package game.interactable;

import ui.UI;
import ui.interactable.ButcheryUIPlace;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class Butchery extends BaseMarket {
    private static Butchery ourInstance = new Butchery();

    public static Butchery getInstance() {
        return ourInstance;
    }

    private Butchery() {
        super();
    }

    @Override
    public UI getUI() {
        return new ButcheryUIPlace();
    }
   // public getStoredItem
}
