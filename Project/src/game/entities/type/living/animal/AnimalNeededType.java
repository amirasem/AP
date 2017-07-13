package game.entities.type.living.animal;

import game.entities.type.api.EntityType;

/**
 * Created by AmirHosein on 7/5/2017.
 * ASAY
 */
public enum AnimalNeededType implements EntityType {
    SHEEP_NORMAL_POTION(100) , COW_NORMAL_POTION(150) , CHICKEN_NORMAL_POTION(50),
    SHEEP_STRONG_POTION(200) , COW_STRONG_POTION(300) , CHICKEN_STRONG_POTION(100),
    SHEEP_EXTRA_POTION(300) , COW_EXTRA_POTION(450) , CHICKEN_EXTRA_POTION(250) ,
    ALFALFA_SHEEP_FOOD(20) , ALFALFA_COW_FOOD(20) , SEED_CHICKEN_FOOD(10);
    ;
    private final int price;
    AnimalNeededType(int price){
        this.price  = price;
    }
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getStatus() {
        return name().toLowerCase();
    }
}
