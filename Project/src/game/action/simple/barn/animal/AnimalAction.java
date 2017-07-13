package game.action.simple.barn.animal;

import game.action.api.Action;
import game.entities.type.living.animal.Animal;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
abstract public class AnimalAction implements Action{
    protected final Animal animal;

    public AnimalAction(Animal animal) {
        this.animal = animal;
    }
}
