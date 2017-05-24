package game.entities.type.eatable;

import game.animals.properties.Live;
import game.animals.properties.LivingPropertyType;
import game.animals.properties.values.LivingPropertyValueType;
import game.entities.type.api.LivingPropertyChanger;
import game.entities.type.eatable.api.EatableEntityType;

/**
 * Created by ahay on 4/19/17.
 * GIBILI GIBILI
 */
public enum Potion implements EatableEntityType {
    NORMAL(150, new LivingPropertyChanger(100, LivingPropertyType.HEALTH, LivingPropertyValueType.CURRENT)),
    STRONG(350, new LivingPropertyChanger(250, LivingPropertyType.HEALTH, LivingPropertyValueType.CURRENT)),
    EXTREME(600, new LivingPropertyChanger(500, LivingPropertyType.HEALTH, LivingPropertyValueType.CURRENT));

    private final int price;
    private final LivingPropertyChanger[] changer;

    Potion(int price, LivingPropertyChanger... changer) {
        this.price = price;
        this.changer = changer;
    }

    @Override
    public void getEaten(Live live) {

    }

    @Override
    public int getPrice() {
        return price;
    }

    public int getValue() {
        int healthPoint = 0;
        for (LivingPropertyChanger l : changer) healthPoint = l.getValue();
        return healthPoint;
    }

    public String getStatus() {
        return "It heals" + " " + getValue() + " " + "health points.";
    }

    public String getUse() {
        return getValue() + "health points healed.";
    }

}
