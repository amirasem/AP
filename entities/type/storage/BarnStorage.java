package game.entities.type.storage;

import game.entities.Entity;
import game.entities.type.living.animal.Animal;
import game.entities.type.living.animal.AnimalType;
import game.entities.type.living.animal.Sheep;
import ui.UI;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class BarnStorage extends AbstractStorage {
    private final BarnBox sheep = new BarnBox(5);
    private final BarnBox cows = new BarnBox(5);
    private final BarnBox hens = new BarnBox(10);

    @Override
    public boolean hasCapacityFor(Entity entityType, int value) {
        if (entityType.getType() == AnimalType.COW) return cows.hasCapacityFor(entityType, value);
        if (entityType.getType() == AnimalType.SHEEP) return sheep.hasCapacityFor(entityType, value);
        return entityType.getType() == AnimalType.CHICKEN && hens.hasCapacityFor(entityType, value);
    }

    @Override
    public UI getUI() {
        return null;
    }

    private static BarnStorage ourInstance = new BarnStorage();

    public static BarnStorage getInstance() {
        return ourInstance;
    }

    private BarnStorage() {
        super(0);
        sheep.put(new Sheep("Gavi"), 1);
    }

    public ArrayList<Animal> getAnimals() {
        ArrayList<Animal> animals = sheep.getStoredItems().stream().map(p -> (Animal) p.getEntity()).collect(Collectors.toCollection(ArrayList::new));
        animals.addAll(cows.getStoredItems().stream().map(p -> (Animal) p.getEntity().getType()).collect(Collectors.toList()));
        animals.addAll(hens.getStoredItems().stream().map(p -> (Animal) p.getEntity().getType()).collect(Collectors.toList()));
        return animals;
    }


}
