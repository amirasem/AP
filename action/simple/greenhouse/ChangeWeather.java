package game.action.simple.greenhouse;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.greenhouse.ChangeWheatherUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class ChangeWeather extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new ChangeWheatherUI(this);
    }
}
