package ui.interactable.laboratory;

import game.interactable.Interactable;
import ui.interactable.InteractableMenuUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class BuildMachineUI extends InteractableMenuUI {
    public BuildMachineUI(Interactable interactable) {
        super("Choose the machine want build: ", interactable);
    }
}
