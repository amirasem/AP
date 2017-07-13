package game.action.simple.gym;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.gym.TrainUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class Train extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new TrainUI(this);
    }
}
