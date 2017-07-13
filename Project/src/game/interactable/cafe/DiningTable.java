package game.interactable.cafe;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.cafe.DiningTableUI;

/**
 * Created by Amir on 5/10/2017.
 * AHAY
 */
public class DiningTable extends AbstractInteractable {
    private static DiningTable ourInstance = new DiningTable();

    public static DiningTable getInstance() {
        return ourInstance;
    }

    public DiningTable() {
    }

    @Override
    public UI getUI() {
        return new DiningTableUI(this);
    }
}
