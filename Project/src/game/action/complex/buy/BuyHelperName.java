package game.action.complex.buy;

import game.entities.type.eatable.AnimalFoods;
import game.entities.type.eatable.CookMaterial;
import game.entities.type.eatable.Foods;
import game.entities.type.eatable.Potion;
import game.entities.type.instrument.cook.CookTool;
import game.entities.type.living.animal.AnimalType;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public class BuyHelperName {
    private static game.action.complex.buy.BuyHelperName ourInstance = new game.action.complex.buy.BuyHelperName();

    public static game.action.complex.buy.BuyHelperName getInstance() {
        return ourInstance;
    }

    private BuyHelperName() {
    }

    public CookMaterial getMaterial(String name) {
        String[] parts = name.split("_");
        switch (parts[1]) {
            case "SUGAR":
                return CookMaterial.valueOf(parts[2]);
            case "SALT":
                return CookMaterial.valueOf(parts[2]);
            case "PAPER":
                return CookMaterial.valueOf(parts[2]);
            case "EGG":
                return CookMaterial.valueOf(parts[2]);
            case "MEAT":
                CookMaterial.valueOf(parts[2]);
            case "OIL":
                return CookMaterial.valueOf(parts[2]);
            case "FRUIT_JUICE":
                return CookMaterial.valueOf(parts[2]);
            case "LEMON_JUICE":
                return CookMaterial.valueOf(parts[2]);
            case "VEGETABLES":
                return CookMaterial.valueOf(parts[2]);

        }
        return null;
    }

    public CookTool getCookTool(String name) {
        String[] parts = name.split("_");
        switch (parts[1]) {
            case "OVEN":
                return CookTool.valueOf(parts[2]);
            case "PAN":
                return CookTool.valueOf(parts[2]);
            case "POT":
                CookTool.valueOf(parts[2]);
            case "AGITATOR":
                return CookTool.valueOf(parts[2]);
            case "KNIFE":
                return CookTool.valueOf(parts[2]);
        }
        return null;
    }

    public AnimalFoods getAnimalFood(String name) {
        String[] parts = name.split("_");
        switch (parts[1]) {
            case "ALFALFA":
                return AnimalFoods.valueOf(parts[2]);
            case "SEED":
                return AnimalFoods.valueOf(parts[2]);
        }
        return null;
    }

    public Potion getPotion(String name) {
        String[] parts = name.split("_");
        switch (parts[1]) {
            case "HUMAN":
                return Potion.valueOf(parts[2]);
            case "ANIMAL":
                return Potion.valueOf(parts[2]);
        }
        return null;
    }

    public Foods getFoods(String name) {
        String[] parts = name.split("_");
        switch (parts[1]) {
            case "MIRZAGHASEMI":
                return Foods.valueOf(parts[2]);
            case "SHIRAZISALAD":
                return Foods.valueOf(parts[2]);
            case "CHEESECAKE":
                return Foods.valueOf(parts[2]);
            case "FRENCHFRIES":
                return Foods.valueOf(parts[2]);
        }
        return null;
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


}

