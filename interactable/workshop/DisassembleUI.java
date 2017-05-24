package ui.interactable.workshop;

import game.interactable.Interactable;
import ui.interactable.InteractableMenuUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class DisassembleUI extends InteractableMenuUI {
    public DisassembleUI(Interactable interactable) {
        super("Do you want disassemble this tool with this price ? (Y/N)", interactable);
    }
}
