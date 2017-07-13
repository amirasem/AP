package game.action.simple.gym;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.gym.EnergyMenuUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class EnergyMenu extends AbstractInteractable {
    private static EnergyMenu ourInstance = new EnergyMenu();

    public static EnergyMenu getInstance() {
        return ourInstance;
    }

    public EnergyMenu() {
    }
    @Override
    public UI getUI() {
        return new EnergyMenuUI(this);
    }
}
