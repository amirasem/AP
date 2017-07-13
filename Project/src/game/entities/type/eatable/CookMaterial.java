package game.entities.type.eatable;

import game.animals.properties.Live;
import game.entities.type.api.EntityType2;
import game.entities.type.api.LivingPropertyChanger;
import game.entities.type.eatable.api.EatableEntityType;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public enum CookMaterial implements EatableEntityType{
    OIL(30),
    SALT(10),
    PAPER(10),
    SUGAR(10),
    FRUIT_JUICE,
    VEGETABLES,
    LEMON_JUICE,
    CHEESE,
    FLOUR(20);
    private int price;

    CookMaterial(int price, LivingPropertyChanger... livingPropertyChangers) {
        this.price = price;
    }

    CookMaterial() {
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void getEaten(Live live) {
//  TODO:
    }

    @Override
    public String getStatus() {
        return "Coock Material";
    }


    @Override
    public String toString() {
        return name() + " X";
    }
}
