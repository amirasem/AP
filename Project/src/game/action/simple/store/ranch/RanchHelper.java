package game.action.simple.store.ranch;

import game.entities.Entity;
import game.entities.type.living.animal.Animal;
import game.entities.type.living.animal.AnimalNeededType;
import game.entities.type.living.animal.AnimalType;

import java.util.ArrayList;

/**
 * Created by AmirHosein on 7/5/2017.
 * ASAY
 */
public class RanchHelper {
        static ArrayList<Entity> getList()
        {
            ArrayList<Entity> l  = new ArrayList<>();
            l.add(new Animal("Cow" , AnimalType.COW));
            l.add(new Animal("Chicken" , AnimalType.CHICKEN));
            l.add(new Animal("Sheep" , AnimalType.SHEEP));
            l.add(new Animal("Fish", AnimalType.FISH));
            return l;
        }
        static ArrayList<Entity> getListForBuyItem(){
            ArrayList<Entity> l = new ArrayList<>();
            l.add(new AnimalNeeded("Sheep Normal Potion" , AnimalNeededType.SHEEP_NORMAL_POTION));
            l.add(new AnimalNeeded("Cow Normal Potion" , AnimalNeededType.COW_NORMAL_POTION ));
            l.add(new AnimalNeeded("Chicken Normal Potion" , AnimalNeededType.CHICKEN_NORMAL_POTION ));
            l.add(new AnimalNeeded("Sheep Strong Potion" , AnimalNeededType.SHEEP_STRONG_POTION ));
            l.add(new AnimalNeeded("Cow STRONG Potion" , AnimalNeededType.COW_STRONG_POTION ));
            l.add(new AnimalNeeded("Chicken Strong Potion" , AnimalNeededType.CHICKEN_STRONG_POTION ));
            l.add(new AnimalNeeded("Sheep Extra Potion" , AnimalNeededType.SHEEP_EXTRA_POTION));
            l.add(new AnimalNeeded("Cow Extra Potion" , AnimalNeededType.COW_EXTRA_POTION ));
            l.add(new AnimalNeeded("Chicken Extra Potion" , AnimalNeededType.CHICKEN_EXTRA_POTION) );
            l.add(new AnimalNeeded("Alfalfa Cow" , AnimalNeededType.ALFALFA_COW_FOOD));
            l.add(new AnimalNeeded("Alfalfa Sheep" , AnimalNeededType.ALFALFA_SHEEP_FOOD));
            l.add(new AnimalNeeded("Seed Chicken" , AnimalNeededType.SEED_CHICKEN_FOOD));
            return l;
        }
}
