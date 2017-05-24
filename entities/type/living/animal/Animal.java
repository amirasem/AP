package game.entities.type.living.animal;

import game.action.simple.barn.animal.Feed;
import game.action.simple.barn.animal.Harvest;
import game.action.simple.barn.animal.Heal;
import game.action.simple.barn.animal.Status;
import game.entities.Entity;
import game.entities.type.api.EntityType;
import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.AnimalUI;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class Animal extends AbstractInteractable implements Entity {
    private final String name;
    private final AnimalType type;
//    LivingProperty[] livingProperties = new LivingProperty[]{};

    public Animal(String name, AnimalType type) {
        this.name = name;
        this.type = type;
        addAction(new Status(this));
        addAction(new Feed(this));
        addAction(new Heal(this));
        addAction(new Harvest(this));
    }

    public String getName() {
        return name;
    }

    public AnimalType getType() {
        return type;
    }

    @Override
    public String getStatus() {
//        TODO: AH
        return null;
    }

    public UI getUI() {
        return new AnimalUI(this);
    }

    public int getPrice() {
        return getType().getPrice();
    }
}

