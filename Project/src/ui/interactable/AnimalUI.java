package ui.interactable;

import game.interactable.Interactable;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class AnimalUI extends InteractableMenuUI {
    public AnimalUI(Interactable interactable) {
        super(interactable.getName(), interactable);
    }
}
