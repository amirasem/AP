package game.entities.type.eatable;

import com.sun.org.apache.bcel.internal.generic.NEW;
import game.animals.properties.Live;
import game.animals.properties.LivingPropertyType;
import game.animals.properties.values.LivingPropertyValueType;
import game.entities.Entity;
import game.entities.type.api.EntityType;
import game.entities.type.api.EntityType2;
import game.entities.type.api.LivingPropertyChanger;
import game.entities.type.eatable.api.EatableEntityType;
import game.environment.Season;

;

public enum Fruit implements EatableEntityType, Entity {
    //    SPRING:
    PEAR(Season.SPRING, 3, 15, new LivingPropertyChanger(20, V.E, V.C), new LivingPropertyChanger(20, V.S, V.C)),
    PEACH(Season.SPRING, 3, 15, new LivingPropertyChanger(15, V.H, V.C), new LivingPropertyChanger(15, V.S, V.C)),
    EGGPLANT(Season.SPRING, 3, 20, new LivingPropertyChanger(10, V.H, V.C),
            new LivingPropertyChanger(-5, V.E, V.C), new LivingPropertyChanger(-5, V.S, V.C)),
    LETTUCE(Season.SPRING, 1, 10, new LivingPropertyChanger(10, V.H, V.C), new LivingPropertyChanger(10, V.S, V.C)),
    GARLIC(Season.SPRING, 1, 15, new LivingPropertyChanger(2, V.H, V.M), new LivingPropertyChanger(2, V.S, V.C)),
    PEAS(Season.SPRING, 3, 10, new LivingPropertyChanger(2, V.E, V.M), new LivingPropertyChanger(2, V.S, V.C)),
    POMEGRANATE(Season.SUMMER, 3, 25, new LivingPropertyChanger(15, V.H, V.C),
            new LivingPropertyChanger(15, V.H, V.C),
            new LivingPropertyChanger(5, V.E, V.M), new LivingPropertyChanger(5, V.S, V.C)),
    LEMON(Season.SUMMER, 3, 15, new LivingPropertyChanger(20, V.E, V.C), new LivingPropertyChanger(20, V.S, V.C)),
    CUCUMBERS(Season.SUMMER, 3, 10, new LivingPropertyChanger(10, V.E, V.C), new LivingPropertyChanger(10, V.S, V.C)),
    WATERMELON(Season.SUMMER, 3, 80, new LivingPropertyChanger(10, V.H, V.C),
            new LivingPropertyChanger(50, V.E, V.C),
            new LivingPropertyChanger(10, V.E, V.M), new LivingPropertyChanger(60, V.S, V.C)),
    TURNIP(Season.SUMMER, 1, 15, new LivingPropertyChanger(3, V.H, V.M),
            new LivingPropertyChanger(3, V.E, V.M), new LivingPropertyChanger(3, V.S, V.C)),
    ORANGE(Season.FALL, 3, 20, new LivingPropertyChanger(10, V.H, V.C),
            new LivingPropertyChanger(5, V.E, V.M), new LivingPropertyChanger(5, V.S, V.C)),
    APPLE(Season.FALL, 3, 20, new LivingPropertyChanger(10, V.E, V.C),
            new LivingPropertyChanger(5, V.H, V.M), new LivingPropertyChanger(10, V.S, V.C)),
    ONION(Season.SUMMER, 1, 15, new LivingPropertyChanger(5, V.H, V.M), new LivingPropertyChanger(5, V.S, V.C)),
    POTATO(Season.FALL, 1, 25, new LivingPropertyChanger(10, V.E, V.C),
            new LivingPropertyChanger(-5, V.H, V.C), new LivingPropertyChanger(-5, V.S, V.C)),
    CARROT(Season.FALL, 1, 25, new LivingPropertyChanger(10, V.H, V.M), new LivingPropertyChanger(10, V.S, V.C)),
    TOMATO(Season.FALL, 3, 10, new LivingPropertyChanger(5, V.H, V.C),
            new LivingPropertyChanger(5, V.E, V.C), new LivingPropertyChanger(5, V.S, V.C)),
    MELON(Season.FALL, 3, 60, new LivingPropertyChanger(40, V.E, V.C),
            new LivingPropertyChanger(10, V.H, V.C),
            new LivingPropertyChanger(5, V.E, V.M), new LivingPropertyChanger(40, V.S, V.C)),
    PINEAPPLE(Season.GREENHOUSE, 3, 150, new LivingPropertyChanger(15, V.H, V.C),
            new LivingPropertyChanger(15, V.E, V.C),
            new LivingPropertyChanger(15, V.E, V.M),
            new LivingPropertyChanger(15, V.H, V.M),
            new LivingPropertyChanger(100, V.S, V.C)),
    STRAWBERRY(Season.GREENHOUSE, 3, 50, new LivingPropertyChanger(10, V.H, V.C),
            new LivingPropertyChanger(10, V.E, V.C),
            new LivingPropertyChanger(5, V.H, V.M),
            new LivingPropertyChanger(5, V.E, V.M),
            new LivingPropertyChanger(10, V.S, V.C)),
    PAPER(Season.GREENHOUSE, 3, 25, new LivingPropertyChanger(10, V.E, V.C),
            new LivingPropertyChanger(5, V.H, V.M),
            new LivingPropertyChanger(10, V.S, V.C));

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
    public EntityType getType() {
        return null;
    }

    @Override
    public String getStatus() {
        return "A" + " " + getName() +
                " " + "It can be used while cooking";
    }


    public String getUse() {
        return "You are eating" + " " + getName() + " " + ".";
    }

    @Override
    public String toString() {
        return name() + " X";
    }
}
