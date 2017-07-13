package game.action.simple.store.kitchen;

import game.animals.properties.LivingProperty;
import game.animals.properties.LivingPropertyType;
import game.entities.Eatable;
import game.entities.type.api.LivingPropertyChanger;
import game.entities.type.eatable.Foods;
import game.entities.type.eatable.Fruit;
import game.entities.type.requirement.Requirements;

import java.util.ArrayList;

/**
 * Created by AmirHosein on 5/24/2017.
 */
public class KitchenHelper {
    static ArrayList<Eatable> getList() {
        ArrayList<Eatable> l = new ArrayList<>();
        for (Foods f : Foods.values()) l.add(new Eatable(f));
        return l;
    }
    static ArrayList<LivingPropertyType> getProperty(){
     ArrayList<LivingPropertyType> changers = new ArrayList<>();
     for (Foods f : Foods.values()){
         changers.addAll(f.getChangers());
     }
     return changers;
    }
    static ArrayList<Requirements> getTools(){
        ArrayList<Requirements> tool  = new ArrayList<>();
        for (Foods f : Foods.values())
        {
            tool.addAll(getTools());
        }
        return tool;
    }

}
