package game.action.simple.gym;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.gym.HealthMenuUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class HealthMenu extends AbstractInteractable {
    private static HealthMenu ourInstance = new HealthMenu();

    public static HealthMenu getInstance() {
        return ourInstance;
    }

    public HealthMenu() {
    }
    @Override
    public UI getUI() {
        return new HealthMenuUI(this);
    }
}
