package ui.interactable.clinic;

import game.interactable.Interactable;
import ui.interactable.InteractableMenuUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class HealUpUI extends InteractableMenuUI {
    public HealUpUI(Interactable interactable) {
        super("You will Heal up for 500 Gil. Is this okay? (Y/N)", interactable);
    }
}
