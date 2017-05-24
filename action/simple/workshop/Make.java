package game.action.simple.workshop;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.workshop.MakeUI;

/**
 * Created by Amir on 5/11/2017.
 * AHAY
 */
public class Make extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new MakeUI(this);
    }
}
