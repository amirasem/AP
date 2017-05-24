package game.action.simple.check;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.laboratory.CheckMachineUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class CheckMachine extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new CheckMachineUI(this);
    }
}
