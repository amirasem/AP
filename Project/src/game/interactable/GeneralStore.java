package game.interactable;

import ui.UI;
import ui.interactable.GeneralStoreUI;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class GeneralStore extends BaseMarket {
    private static GeneralStore ourInstance = new GeneralStore();

    public static GeneralStore getInstance() {
        return ourInstance;
    }

    private GeneralStore() {
        super();
    }

    @Override
    public UI getUI() {
        return new GeneralStoreUI();
    }
}
