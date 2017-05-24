package game.action.simple.clinic;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.clinic.HealUpUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class HealUp extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new HealUpUI(this);
    }
}
