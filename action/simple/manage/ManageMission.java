package game.action.simple.manage;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.cafe.ManageMissionUI;

/**
 * Created by Amir on 5/10/2017.
 * AHAY
 */
public class ManageMission extends AbstractInteractable {
    private static ManageMission ourInstance = new ManageMission();

    public static ManageMission getInstance() {
        return ourInstance;
    }

    private ManageMission() {
    }

    @Override
    public UI getUI() {
        return new ManageMissionUI(this);
    }
}
