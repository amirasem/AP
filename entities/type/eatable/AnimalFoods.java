package game.entities.type.eatable;

import game.animals.properties.Live;
import game.entities.type.eatable.api.EatableEntityType;
import game.entities.type.living.animal.AnimalType;

import java.util.ArrayList;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public enum  AnimalFoods implements EatableEntityType {
    ALFALFA(20 , AnimalType.COW , AnimalType.SHEEP), SEED(10,AnimalType.CHICKEN);

    private final int price;
    private final AnimalType [] animals ;


    AnimalFoods(int price , AnimalType ... animals) {
        this.price = price;
        this.animals = animals;
    }

    @Override
    public void getEaten(Live live) {
//        TODO:
    }
    public ArrayList<String> getAnimalName()
    {
        ArrayList<String> name = new ArrayList<>();
        for (AnimalType a: animals){
            name.add(a.getName());
        }
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
    public String getStatus()
    {
        return "Food for" + " " + getAnimalName() + " .";
    }

}
