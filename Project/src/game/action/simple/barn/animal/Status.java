package game.action.simple.barn.animal;

import game.entities.type.living.animal.Animal;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class Status extends AnimalAction {

    public Status(Animal animal) {
        super(animal);
    }

    @Override
    public boolean isActionValid() {
        return true;
    }

    @Override
    public void happen() {
//        TODO: Status
        System.out.println("Checking the status for" + animal.getName());
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
