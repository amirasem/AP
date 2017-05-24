package ui.interactable.gym;

import game.interactable.Interactable;
import ui.interactable.InteractableMenuUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class TrainUI extends InteractableMenuUI {
    public TrainUI(Interactable interactable) {
        super("This training will cost you 500 Gil. Is this okay? (Y/N)", interactable);
    }
}
