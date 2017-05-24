package ui.interactable.entities;

import game.interactable.Interactable;
import ui.interactable.InteractableMenuUI;

/**
 * Created by ahay on 5/8/17.
 * <p>
 * GIBILI GIBILI
 */
public class CollectRocksUI extends InteractableMenuUI {
    public CollectRocksUI(Interactable interactable) {
        super("Choose a Pickaxe from your inventory ." +
                " It has to be a Stone(or a stronger kind) Pickaxe.", interactable);
    }
}
