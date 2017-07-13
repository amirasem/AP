package ui.interactable;

import game.interactable.Kitchen;

/**
 * Created by ahay on 5/6/17.
 * <p>
 * GIBILI GIBILI
 */
public class KitchenUI extends InteractableMenuUI {
    public KitchenUI() {
        super("Kitchen ", Kitchen.getInstance());
    }
}
