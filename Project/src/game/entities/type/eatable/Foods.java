package game.entities.type.eatable;

import com.sun.org.apache.regexp.internal.RE;
import game.animals.properties.Live;
import game.animals.properties.LivingProperty;
import game.animals.properties.LivingPropertyType;
import game.animals.properties.values.LivingPropertyValueType;
import game.entities.Entity;
import game.entities.type.api.LivingPropertyChanger;
import game.entities.type.eatable.api.EatableEntityType;
import game.entities.type.instrument.cook.CookTool;
import game.entities.type.noteatable.RawMaterialCooking;
import game.entities.type.requirement.CreatableEntityType;
import game.entities.type.requirement.PairOfEntityTypeValue;
import game.entities.type.requirement.PairOfEntityTypeValue;
import game.entities.type.requirement.Requirements;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */

public enum Foods implements EatableEntityType, CreatableEntityType  {

    FRENCH_FRIES(new Requirements(
            100, new PairOfEntityTypeValue(Fruit.POTATO, 1),
            new PairOfEntityTypeValue(CookTool.KNIFE, 1),
            new PairOfEntityTypeValue(CookTool.PAN, 1),
            new PairOfEntityTypeValue(CookMaterial.OIL, 1),
            new PairOfEntityTypeValue(CookMaterial.SALT, 1)),
            new LivingPropertyChanger(100, V.E, V.C),
            new LivingPropertyChanger(-15, V.H, V.M) ,
            new LivingPropertyChanger(-10 , V.S , V.C)),

    SHIRAZI_SALAD(new Requirements(100, new PairOfEntityTypeValue(Fruit.TOMATO, 1),
            new PairOfEntityTypeValue(Fruit.CUCUMBERS, 1),
            new PairOfEntityTypeValue(CookTool.KNIFE, 1),
            new PairOfEntityTypeValue(Fruit.ONION, 1),
            new PairOfEntityTypeValue(CookMaterial.LEMON_JUICE, 1)),
            new LivingPropertyChanger(60, V.H, V.C),
            new LivingPropertyChanger(40, V.E, V.C),
            new LivingPropertyChanger(10, V.H, V.M) ,
            new LivingPropertyChanger(20 , V.S , V.C)),

    CHEESECAKE(new Requirements(100, new PairOfEntityTypeValue(OtherEatable.MILK, 1),
            new PairOfEntityTypeValue(CookMaterial.CHEESE, 1),
            new PairOfEntityTypeValue(CookMaterial.SUGAR, 1),
            new PairOfEntityTypeValue(RawMaterialCooking.EGG, 1),
            new PairOfEntityTypeValue(CookTool.POT, 1),
            new PairOfEntityTypeValue(CookTool.AGITATOR, 1), new PairOfEntityTypeValue(CookTool.OVEN, 1)),
            new LivingPropertyChanger(80, V.E, V.C) ,
            new LivingPropertyChanger(30 , V.S ,V.C)),

    MIRZAGHASEMI(new Requirements(100, new PairOfEntityTypeValue(CookMaterial.OIL, 1),
            new PairOfEntityTypeValue(Fruit.GARLIC , 1 ),
            new PairOfEntityTypeValue(Fruit.EGGPLANT, 1),
            new PairOfEntityTypeValue(Fruit.TOMATO, 1),
            new PairOfEntityTypeValue(RawMaterialCooking.EGG, 1),
            new PairOfEntityTypeValue(CookMaterial.SALT, 1),
            new PairOfEntityTypeValue(CookTool.KNIFE, 1),
            new PairOfEntityTypeValue(CookTool.PAN , 1)),
            new LivingPropertyChanger(70, V.E, V.C),
            new LivingPropertyChanger(30, V.H, V.C),
            new LivingPropertyChanger(10, V.H, V.M) ,
            new LivingPropertyChanger(50 , V.S ,V.C));

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
        return getName() + ":" + "\n\n" + "Tools needed :" +
                Arrays.toString(new String[]{Arrays.toString(valueOf(getName()).requirements.getRequirements()) + "\n\n"+
                "Stats :" + Arrays.toString(valueOf(getName()).findType(changers))}) + "\n\n"+
                Arrays.toString(valueOf(getName()).findValue(changers)) + "\n\n" + "Do you want to cook this meal? (Y/N)";
    }

    public String getUse() {
        return "You are using" + " " + getName() + " " + "But do not Overeat";
    }


    public ArrayList<LivingPropertyType> getChangers() {
        ArrayList<LivingPropertyType>properties = new ArrayList<>();
        for (LivingPropertyChanger changer : changers) {
            properties.add(changer.getType());
        }
        return properties;
    }
    public int[] findValue(LivingPropertyChanger[] changer){
        int []result = new int[changer.length];
        for (int i  = 0 ; i<changer.length ;i++){
            result[i] = changer[i].getValue();
        }
        return result;
    }
    public LivingPropertyType[] findType(LivingPropertyChanger[] changer){
        LivingPropertyType[]result = new LivingPropertyType[changer.length];
        for (int i  = 0 ;i<changer.length;i++){
            result[i] = changer[i].getType();
        }
        return result;
    }
    public ArrayList<Requirements> getRequarments(){
        ArrayList<Requirements> tool = new ArrayList<>();
        for (Foods f:Foods.values())
        {
            tool.add(requirements);
        }
        return tool;
    }

    public Requirements getRequirements() {
        return requirements;
    }

    @Override
    public String toString() {
        return name() + " X";
    }
}
