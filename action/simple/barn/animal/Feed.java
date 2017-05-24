package game.action.simple.barn.animal;

import game.entities.type.living.animal.Animal;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class Feed extends AnimalAction {

    public Feed(Animal animal) {
        super(animal);
    }

    @Override
    public boolean isActionValid() {
        return false;
    }

    @Override
    public void happen() {
//        TODO
        System.out.println("Feeding the cow");
    }

    @Override
    public String getName() {
        return "Feed this" + animal.getType();
    }
}
