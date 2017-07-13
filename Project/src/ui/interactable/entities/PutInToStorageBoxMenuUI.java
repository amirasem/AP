package ui.interactable.entities;

import game.action.simple.picker.BackPackPicker;
import game.action.simple.put.PutInToStorageBoxMenu;
import game.entities.type.storage.Backpack;
import game.interactable.Interactable;
import ui.interactable.InteractableMenuUI;

/**
 * Created by ahay on 5/6/17.
 * <p>
 * GIBILI GIBILI
 */
public class PutInToStorageBoxMenuUI extends InteractableMenuUI {

    public PutInToStorageBoxMenuUI(Interactable interactable) {
        super("Choose item from your Backpack to put in "   , interactable);
      //  System.out.println("Hello");
    }

}
