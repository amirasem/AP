package game.action.simple.barn.animal;

import game.entities.type.living.animal.Animal;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class Heal extends AnimalAction {
    public Heal(Animal animal) {
        super(animal);
    }

    @Override
    public boolean isActionValid() {
        return true;
    }

    @Override
    public void happen() {
//        TODO:
        System.out.println("Healing");
    }

    @Override
    public String getName() {
        return "Heal this " + animal.getType();
    }
}
