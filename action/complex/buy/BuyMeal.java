package game.action.complex.buy;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.cafe.BuyMealUI;

/**
 * Created by Amir on 5/11/2017.
 * AHAY
 */
public class BuyMeal extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new BuyMealUI(this);
    }
}
