package game.action.simple.greenhouse;

import game.action.api.ActionHandler;
import game.action.simple.SimpleAction;
import game.interactable.AbstractInteractable;
import game.places.store.Greenhouse;
import ui.UI;
import ui.interactable.greenhouse.RepairGreenhouseUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class RepairGreenhouse extends SimpleAction {
    @Override
    protected ActionHandler[] getActionInput() {
        return new ActionHandler[]{Greenhouse.getInstance()};
    }

    @Override
    protected ActionHandler[] getActionOutput() {
        return new ActionHandler[0];
    }

    @Override
    public String getName() {
        return "Repair";
    }
}
