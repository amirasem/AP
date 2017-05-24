package game.action.simple.workshop;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.workshop.RepairUI;

/**
 * Created by Amir on 5/11/2017.
 * AHAY
 */
public class Repair extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new RepairUI(this);
    }
}
