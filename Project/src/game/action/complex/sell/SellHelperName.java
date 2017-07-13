package game.action.complex.sell;

import game.entities.type.eatable.Fruit;
import game.entities.type.living.animal.AnimalType;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public class SellHelperName {
    private static SellHelperName ourInstance = new SellHelperName();

    public static SellHelperName getInstance() {
        return ourInstance;
    }

    private SellHelperName() {
    }

    AnimalType getAnimal(String name) {
        switch (name) {
            case "COW":
                return AnimalType.COW;
            case "CHICKEN":
                return AnimalType.CHICKEN;
            case "SHEEP":
                return AnimalType.SHEEP;
        }
        return null;
    }
    Fruit getFruit (String name)
    {
        String[] parts = name.split("_");
        switch (parts[1]){
            case "PEAR":
                return Fruit.valueOf(parts[2]);

            case "PEACH":
                return Fruit.valueOf(parts[2]);

            case "EGGPLANT":
                return Fruit.valueOf(parts[2]);

            case "LETTUCE":
                return Fruit.valueOf(parts[2]);

            case "GARLIC":
                return Fruit.valueOf(parts[2]);

            case "PEAS":
                return Fruit.valueOf(parts[2]);

            case "POMEGRANATE":
                return Fruit.valueOf(parts[2]);

            case "LEMON":
                return Fruit.valueOf(parts[2]);

            case "CUCUMBERS":
                return Fruit.valueOf(parts[2]);

            case "WATERMELON":
                return Fruit.valueOf(parts[2]);

            case "TURNIP":
                return Fruit.valueOf(parts[2]);

            case "ORANGE":
                return Fruit.valueOf(parts[2]);

            case "APPLE":
                return Fruit.valueOf(parts[2]);

            case "ONION":
                return Fruit.valueOf(parts[2]);

            case "POTATO":
                return Fruit.valueOf(parts[2]);

            case "CARROT":
                return Fruit.valueOf(parts[2]);

            case "TOMATO":
                return Fruit.valueOf(parts[2]);

            case "MELON":
                return Fruit.valueOf(parts[2]);

            case "PINEAPPLE":
                return Fruit.valueOf(parts[2]);

            case "STRAWBERRY":
                return Fruit.valueOf(parts[2]);

            case "PAPER":
                return Fruit.valueOf(parts[2]);

        }
        return null;
    }
}

    //todo : write getfruit method

