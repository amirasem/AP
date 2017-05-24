package game.action.simple.check;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.cafe.CheckMissionsUI;

/**
 * Created by Amir on 5/10/2017.
 * AHAY
 */
public class CheckMissions extends AbstractInteractable {
    private static CheckMissions ourInstance = new CheckMissions();

    public static CheckMissions getInstance() {
        return ourInstance;
    }

    private CheckMissions() {
    }

    @Override
    public UI getUI() {
        return new CheckMissionsUI(this);
    }
}
