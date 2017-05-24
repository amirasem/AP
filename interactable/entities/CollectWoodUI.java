package ui.interactable.entities;

import game.interactable.Interactable;
import ui.interactable.InteractableMenuUI;

/**
 * Created by ahay on 5/8/17.
 * <p>
 * GIBILI GIBILI
 */
public class CollectWoodUI extends InteractableMenuUI {
    public CollectWoodUI(Interactable interactable) {
        super("Choose an axe from your inventory. It has to be a Stone(or a stronger kind) AXE.", interactable);
    }
}
