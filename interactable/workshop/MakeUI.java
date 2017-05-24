package ui.interactable.workshop;

import game.interactable.Interactable;
import ui.interactable.InteractableMenuUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class MakeUI extends InteractableMenuUI {
    public MakeUI(Interactable interactable) {
        super("Choose the tool want make: ", interactable);
    }
}
