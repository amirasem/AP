package ui.interactable.entities;

import game.interactable.Interactable;
import ui.interactable.InteractableMenuUI;

/**
 * Created by ahay on 5/6/17.
 * <p>
 * GIBILI GIBILI
 */
public class PutInToStorageBoxMenuUI extends InteractableMenuUI {
    public PutInToStorageBoxMenuUI(Interactable interactable) {
        super("Choose item from your Backpack to put in: ", interactable);
    }
}
