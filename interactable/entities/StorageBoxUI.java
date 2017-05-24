package ui.interactable.entities;

import game.entities.type.storage.StorageBox;
import ui.interactable.InteractableMenuUI;

/**
 * Created by ahay on 5/6/17.
 * <p>
 * GIBILI GIBILI
 */
public class StorageBoxUI extends InteractableMenuUI {
    public StorageBoxUI() {
        super("Storage Box:", StorageBox.getInstance());
    }
}
