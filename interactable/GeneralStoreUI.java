package ui.interactable;

import game.interactable.GeneralStore;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class GeneralStoreUI extends InteractableMenuUI {

    public GeneralStoreUI() {
        super("General Store:", GeneralStore.getInstance());
    }
}
