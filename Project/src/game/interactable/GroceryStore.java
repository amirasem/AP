package game.interactable;

import ui.UI;
import ui.interactable.GroceryStoreUI;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class GroceryStore extends BaseMarket {
    private static GroceryStore ourInstance = new GroceryStore();

    public static GroceryStore getInstance() {
        return ourInstance;
    }

    private GroceryStore() {
        super();
    }

    @Override
    public UI getUI() {
        return new GroceryStoreUI();
    }
}
