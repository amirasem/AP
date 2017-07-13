package sentenced;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.barn.BarnMenuUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class BarnMenu extends AbstractInteractable {
    private static BarnMenu ourInstance = new BarnMenu();

    public static BarnMenu getInstance() {
        return ourInstance;
    }

    private BarnMenu() {
    }
    @Override
    public UI getUI() {
        return new BarnMenuUI(this);
    }
}
