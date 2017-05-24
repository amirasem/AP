package game.entities.type.eatable;

import game.animals.properties.Live;
import game.animals.properties.LivingPropertyType;
import game.animals.properties.values.LivingPropertyValueType;
import game.entities.type.api.LivingPropertyChanger;
import game.entities.type.eatable.api.EatableEntityType;
import game.entities.type.instrument.cook.CookTool;
import game.entities.type.noteatable.RawMaterialCooking;
import game.entities.type.requirement.CreatableEntityType;
import game.entities.type.requirement.PairOfEntityTypeValue;
import game.entities.type.requirement.PairOfEntityTypeValue;
import game.entities.type.requirement.Requirements;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */

public enum Foods implements EatableEntityType, CreatableEntityType {

    FRENCH_FRIES(new Requirements(
            100, new PairOfEntityTypeValue(Fruit.POTATO, 1),
            new PairOfEntityTypeValue(CookTool.KNIFE, 1),
            new PairOfEntityTypeValue(CookTool.PAN, 1),
            new PairOfEntityTypeValue(CookMaterial.OIL, 1),
            new PairOfEntityTypeValue(CookMaterial.SALT, 1)),
            new LivingPropertyChanger(100, LivingPropertyType.ENERGY, LivingPropertyValueType.CURRENT),
            new LivingPropertyChanger(-15, LivingPropertyType.HEALTH, LivingPropertyValueType.MAXIMUM)),

    SHIRAZI_SALAD(new Requirements(100, new PairOfEntityTypeValue(Fruit.TOMATO, 1),
            new PairOfEntityTypeValue(Fruit.CUCUMBERS, 1),
            new PairOfEntityTypeValue(CookTool.KNIFE, 1),
            new PairOfEntityTypeValue(Fruit.ONION, 1),
            new PairOfEntityTypeValue(CookMaterial.LEMON_JUICE, 1)),
            new LivingPropertyChanger(60, LivingPropertyType.HEALTH, LivingPropertyValueType.CURRENT),
            new LivingPropertyChanger(40, LivingPropertyType.ENERGY, LivingPropertyValueType.CURRENT),
            new LivingPropertyChanger(10, LivingPropertyType.HEALTH, LivingPropertyValueType.MAXIMUM)),

    CHEESECAKE(new Requirements(100, new PairOfEntityTypeValue(OtherEatable.MILK, 1),
            new PairOfEntityTypeValue(CookMaterial.CHEESE, 1),
            new PairOfEntityTypeValue(CookMaterial.SUGAR, 1),
            new PairOfEntityTypeValue(RawMaterialCooking.EGG, 1),
            new PairOfEntityTypeValue(CookTool.POT, 1),
            new PairOfEntityTypeValue(CookTool.AGITATOR, 1), new PairOfEntityTypeValue(CookTool.OVEN, 1)),
            new LivingPropertyChanger(80, LivingPropertyType.ENERGY, LivingPropertyValueType.CURRENT)),

    MIRZAGHASEMI(new Requirements(100, new PairOfEntityTypeValue(CookMaterial.OIL, 1),
            new PairOfEntityTypeValue(Fruit.GARLIC, 1),
            new PairOfEntityTypeValue(Fruit.EGGPLANT, 1),
            new PairOfEntityTypeValue(Fruit.TOMATO, 1),
            new PairOfEntityTypeValue(RawMaterialCooking.EGG, 1),
            new PairOfEntityTypeValue(CookMaterial.SALT, 1),
            new PairOfEntityTypeValue(CookTool.KNIFE, 1),
            new PairOfEntityTypeValue(CookTool.PAN, 1)),
            new LivingPropertyChanger(70, LivingPropertyType.ENERGY, LivingPropertyValueType.CURRENT),
            new LivingPropertyChanger(30, LivingPropertyType.HEALTH, LivingPropertyValueType.CURRENT),
            new LivingPropertyChanger(10, LivingPropertyType.HEALTH, LivingPropertyValueType.MAXIMUM));

    final private Requirements requirements;
    final private LivingPropertyChanger[] changers;

    Foods(Requirements requirements, LivingPropertyChanger... changers) {
        this.requirements = requirements;
        this.changers = changers;
    }


    @Override
    public void getEaten(Live live) {
//        TODO:
    }

    @Override
    public int getPrice() {
        return requirements.getMoney();
    }

    @Override
    public boolean canBeCreatedBy(Requirements... requirements) {
        return false;
    }

    public String getName() {
        return name();
    }

    public String getStatus() {
        return "You choose the" + " " + getName() + " " + "Enjoy";
    }

    public String getUse() {
        return "You are using" + " " + getName() + " " + "But do not Overeat";
    }

}
