package game.places;

import game.entities.type.storage.BarnStorage;
import ui.UI;
import ui.place.BarnUI;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class Barn extends AbstractPlace {
    private static Barn ourInstance = new Barn();

    public static Barn getInstance() {
        return ourInstance;
    }

    private Barn() {
        super();
    }

    @Override
    public UI getUI() {
        interactableObjects.clear();
        interactableObjects.addAll(BarnStorage.getInstance().getAnimals());
        return new BarnUI();
    }
}
