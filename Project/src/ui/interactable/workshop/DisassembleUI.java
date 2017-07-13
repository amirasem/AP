package ui.interactable.workshop;

import game.action.simple.picker.BackPackPicker;
import game.interactable.Interactable;
import ui.interactable.InteractableMenuUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class DisassembleUI extends InteractableMenuUI {
    public DisassembleUI(Interactable interactable) {
        super("Choose a tool from your backpack ", interactable);
        new BackPackPicker().print();
    }
}
