package game.interactable;

import ui.UI;
import ui.interactable.MachineUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class Machine extends AbstractInteractable {
    private static Machine ourInstance = new Machine();

    public static Machine getInstance() {
        return ourInstance;
    }

    Machine() {
    }
    @Override
    public UI getUI() {
        return new MachineUI(this);
    }
}
