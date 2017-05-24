package game.entities.type.living.animal;

import game.entities.Entity;
import game.entities.type.api.EntityType;
import game.entities.type.eatable.api.AnimalProduct;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public enum AnimalType implements EntityType {
    CHICKEN(400),
    COW(1000),
    SHEEP(1500),
    FISH(500) ;
    private final int price;

    AnimalType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public String getName()
    {
        return name();
    }

    @Override
    public String getStatus() {
        return "Animal type status todo";
    }
}