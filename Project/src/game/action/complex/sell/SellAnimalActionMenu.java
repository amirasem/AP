package game.action.complex.sell;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.SellAnimalActionMenuUI;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class SellAnimalActionMenu extends AbstractInteractable {
    private static SellAnimalActionMenu ourInstance = new SellAnimalActionMenu();

    public static SellAnimalActionMenu getInstance() {
        return ourInstance;
    }

    public SellAnimalActionMenu() {
    }
    @Override
    public UI getUI() {
        return new SellAnimalActionMenuUI(this);
    }
}
