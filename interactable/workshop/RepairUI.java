package ui.interactable.workshop;

import game.interactable.Interactable;
import ui.interactable.InteractableMenuUI;

/**
 * Created by Amir on 5/11/2017.
 * AHAY
 */
public class RepairUI extends InteractableMenuUI {
    public RepairUI(Interactable interactable) {
        super("Choose a broken tool from your backpack :", interactable);
    }
}
