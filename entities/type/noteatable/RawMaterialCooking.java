package game.entities.type.noteatable;

import game.entities.Entity;
import game.entities.type.api.EntityType;
import game.entities.type.living.animal.AnimalType;

/**
 * Created by AmirHosein on 5/22/2017.
 */
public enum  RawMaterialCooking implements EntityType {
    OIL(30) , FLOUR(20) , SUGAR(10) , SALT(10) , COW_MEAT(100 , AnimalType.COW),EGG(30 , AnimalType.CHICKEN),
    SHEEP_MEAT(150 , AnimalType.SHEEP) , CHICKEN_MEAT(70 , AnimalType.CHICKEN) ,FISH_MEAT(200 , AnimalType.FISH) ,
    ;
    private final int money;
    private AnimalType [] animalType;

    RawMaterialCooking(int money , AnimalType ... animalType) {
        this.money = money;
        this.animalType = animalType;
    }
    public String getStatus()
    {
        return "Can be used while cooking certain foods.";
    }
    public int getPrice()
    {
        return money;
    }

    @Override
    public String toString() {
        return name();
    }
}
