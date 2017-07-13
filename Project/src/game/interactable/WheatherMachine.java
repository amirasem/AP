package game.interactable;

import ui.UI;
import ui.interactable.WheatherMachineUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class WheatherMachine extends AbstractInteractable {
    private static WheatherMachine ourInstance = new WheatherMachine();

    public static WheatherMachine getInstance() {
        return ourInstance;
    }

    private WheatherMachine() {
    }
    @Override
    public UI getUI() {
        return new WheatherMachineUI(this);
    }
}
