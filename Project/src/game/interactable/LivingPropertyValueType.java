package game.interactable;

import ui.UI;
import ui.interactable.gym.LivingPropertyValueTypeUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class LivingPropertyValueType extends AbstractInteractable {
    private static LivingPropertyValueType ourInstance = new LivingPropertyValueType();

    public static LivingPropertyValueType getInstance() {
        return ourInstance;
    }

    public LivingPropertyValueType() {
    }
    @Override
    public UI getUI() {
        return new LivingPropertyValueTypeUI(this);
    }
}
