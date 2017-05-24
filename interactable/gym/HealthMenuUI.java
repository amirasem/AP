package ui.interactable.gym;

import game.interactable.Interactable;
import ui.interactable.InteractableMenuUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class HealthMenuUI extends InteractableMenuUI {
    public HealthMenuUI(Interactable interactable) {
        super("Choose what property value you want increase: ", interactable);
    }
}
