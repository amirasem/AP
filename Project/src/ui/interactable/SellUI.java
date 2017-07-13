package ui.interactable;

import game.interactable.Sell;
import game.interactable.Interactable;

/**
 * Created by ahay on 5/6/17.
 * <p>
 * GIBILI GIBILI
 */
public class SellUI extends InteractableMenuUI {
    public SellUI(Interactable interactable) {
        super("Choose the animal type you want to sell: ",Sell.getInstance());
    }
}
