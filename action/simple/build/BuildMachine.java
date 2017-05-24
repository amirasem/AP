package game.action.simple.build;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.laboratory.BuildMachineUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class BuildMachine extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new BuildMachineUI(this);
    }
}
