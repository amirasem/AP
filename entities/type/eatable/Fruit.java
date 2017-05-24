package game.entities.type.eatable;

import game.animals.properties.Live;
import game.animals.properties.LivingPropertyType;
import game.animals.properties.values.LivingPropertyValueType;
import game.entities.type.api.LivingPropertyChanger;
import game.entities.type.eatable.api.EatableEntityType;
import game.environment.Season;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */

class V {
    static LivingPropertyType E = LivingPropertyType.ENERGY;
    static LivingPropertyType H = LivingPropertyType.HEALTH;

    static LivingPropertyValueType C = LivingPropertyValueType.CURRENT;
    static LivingPropertyValueType M = LivingPropertyValueType.MAXIMUM;
};

public enum Fruit implements EatableEntityType {
    //    SPRING:
    PEAR(Season.SPRING, 3, 15, new LivingPropertyChanger(20, V.E, V.C)),
    PEACH(Season.SPRING, 3, 15, new LivingPropertyChanger(15, V.H, V.C)),
    EGGPLANT(Season.SPRING, 3, 20, new LivingPropertyChanger(10, V.H, V.C),
            new LivingPropertyChanger(-5, V.E, V.C)),
    LETTUCE(Season.SPRING, 1, 10, new LivingPropertyChanger(10, V.H, V.C)),
    GARLIC(Season.SPRING, 1, 15, new LivingPropertyChanger(2, V.H, V.M)),
    PEAS(Season.SPRING, 3, 10, new LivingPropertyChanger(2, V.E, V.M)),
    POMEGRANATE(Season.SUMMER, 3, 25, new LivingPropertyChanger(15, V.H, V.C),
            new LivingPropertyChanger(15, V.H, V.C),
            new LivingPropertyChanger(5, V.E, V.M)),
    LEMON(Season.SUMMER, 3, 15, new LivingPropertyChanger(20, V.E, V.C)),
    CUCUMBERS(Season.SUMMER, 3, 10, new LivingPropertyChanger(10, V.E, V.C)),
    WATERMELON(Season.SUMMER, 3, 80, new LivingPropertyChanger(10, V.H, V.C),
            new LivingPropertyChanger(50, V.E, V.C),
            new LivingPropertyChanger(10, V.E, V.M)),
    TURNIP(Season.SUMMER, 1, 15, new LivingPropertyChanger(3, V.H, V.M),
            new LivingPropertyChanger(3, V.E, V.M)),
    ORANGE(Season.FALL, 3, 20, new LivingPropertyChanger(10, V.H, V.C),
            new LivingPropertyChanger(5, V.E, V.M)),
    APPLE(Season.FALL, 3, 20, new LivingPropertyChanger(10, V.E, V.C),
            new LivingPropertyChanger(5, V.H, V.M)),
    ONION(Season.SUMMER, 1, 15, new LivingPropertyChanger(5, V.H, V.M)),
    POTATO(Season.FALL, 1, 25, new LivingPropertyChanger(10, V.E, V.C),
            new LivingPropertyChanger(-5, V.H, V.C)),
    CARROT(Season.FALL, 1, 25, new LivingPropertyChanger(10, V.H, V.M)),
    TOMATO(Season.FALL, 3, 10, new LivingPropertyChanger(5, V.H, V.C),
            new LivingPropertyChanger(5, V.E, V.C)),
    MELON(Season.FALL, 3, 60, new LivingPropertyChanger(40, V.E, V.C),
            new LivingPropertyChanger(10, V.H, V.C),
            new LivingPropertyChanger(5, V.E, V.M)),
    PINEAPPLE(Season.GREENHOUSE, 3, 150, new LivingPropertyChanger(15, V.H, V.C),
            new LivingPropertyChanger(15, V.E, V.C),
            new LivingPropertyChanger(15, V.E, V.M),
            new LivingPropertyChanger(15, V.H, V.M)),
    STRAWBERRY(Season.GREENHOUSE, 3, 50, new LivingPropertyChanger(10, V.H, V.C),
            new LivingPropertyChanger(10, V.E, V.C),
            new LivingPropertyChanger(5, V.H, V.M),
            new LivingPropertyChanger(5, V.E, V.M)),
    PAPER(Season.GREENHOUSE, 3, 25, new LivingPropertyChanger(10, V.E, V.C),
            new LivingPropertyChanger(5, V.H, V.M));

    private final Season season;
    private final LivingPropertyChanger[] changer;
    private final int numberOfImpressions;
    private final int price;

    Fruit(Season season, int numberOfImpressions, int price, LivingPropertyChanger... changers) {
        this.season = season;
        this.price = price;
        this.changer = changers;
        this.numberOfImpressions = numberOfImpressions;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void getEaten(Live live) {
//        for (LivingPropertyChanger changer : changer) changer.change(live);
    }

    public String getName() {
        return name();
    }

    @Override
    public String getStatus() {
        return "A" + " " + getName() +
                " " + "It can be used while cooking";
    }

    public String getUse() {
        return "You are eating" + " " + getName() + " " + ".";
    }


}
