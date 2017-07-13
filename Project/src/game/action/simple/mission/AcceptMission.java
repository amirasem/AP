package game.action.simple.mission;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.cafe.AcceptMissionUI;

/**
 * Created by Amir on 5/10/2017.
 * AHAY
 */
public class AcceptMission extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new AcceptMissionUI(this);
    }
}
