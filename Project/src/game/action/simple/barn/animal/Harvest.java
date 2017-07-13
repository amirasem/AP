package game.action.simple.barn.animal;

import game.entities.type.living.animal.Animal;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class Harvest extends AnimalAction {

    public Harvest(Animal animal) {
        super(animal);
    }

    @Override
    public boolean isActionValid() {
        return true;
    }

    @Override
    public void happen() {
        System.out.println("Doing costum Action");
    }

    @Override
    public String getName() {
        return "Milking the " + animal.getName();
    }
}
