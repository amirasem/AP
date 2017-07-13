package ui.interactable;

import game.interactable.FruitGarden;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class GardenUI extends InteractableMenuUI {
    public GardenUI() {
        super("Fruit Garden :  ",FruitGarden.getInstance());
    }
}
