package game.action.simple.picker;

import game.entities.Entity;
import game.entities.type.api.EntityType;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class GoodsAndPrices {
    public GoodsAndPrices(int money, EntityType type) {
        this.money = money;
        this.type = type;
    }

    int money;
    EntityType type;

    @Override
    public String toString() {
        return type.toString() + " " + money;
    }

    public int getMoney() {
        return money;
    }

    public EntityType getType() {
        return type;
    }
}
