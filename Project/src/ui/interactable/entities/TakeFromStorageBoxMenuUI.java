package ui.interactable.entities;

import game.interactable.Interactable;
import ui.interactable.InteractableMenuUI;

/**
 * Created by ahay on 5/6/17.
 * <p>
 * GIBILI GIBILI
 */
public class TakeFromStorageBoxMenuUI extends InteractableMenuUI {
    public TakeFromStorageBoxMenuUI(Interactable interactable) {
        super("Choose items from Storage Box you want to take ", interactable);
    }
}
