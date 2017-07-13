package ui.interactable;

import game.interactable.GroceryStore;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class GroceryStoreUI extends InteractableMenuUI {


    public GroceryStoreUI() {
        super("Groceries Store:", GroceryStore.getInstance());
    }
}
