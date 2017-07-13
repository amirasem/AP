package game.action.simple.store.ranch;

import game.entities.Entity;
import game.entities.type.living.animal.AnimalNeededType;
import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.AnimalUI;

/**
 * Created by AmirHosein on 7/5/2017.
 * ASAY
 */
public class AnimalNeeded extends AbstractInteractable implements Entity {
    private final String name;
    private final AnimalNeededType type;

    public AnimalNeeded(String name, AnimalNeededType type) {
        this.name = name;
        this.type = type;
    }
    public String getName() {
        return name;
    }

    public AnimalNeededType getType() {
        return type;
    }

    @Override
    public String getStatus() {
        return name;
    }

    public UI getUI() {
        return new AnimalUI(this);
    }

    public int getPrice() {
        return getType().getPrice();
    }


}
