package game.action.simple.field.empty;

import game.action.simple.picker.StoragePicker;
import game.entities.type.api.EntityType;
import game.entities.type.eatable.Fruit;
import game.entities.type.storage.Backpack;
import game.interactable.field.EmptyCourt;
import game.interactable.field.Field;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class Plant extends EmptyCourtAction {
    public Plant(EmptyCourt court) {
        super(court);
    }

    @Override
    public boolean isActionValid() {
        return true;
    }

    @Override
    public void happen() {
        EntityType entityType = new StoragePicker("Choose a Seed", Backpack.getInstance()).choose().getType();
        if (!entityType.getClass().equals(Fruit.class))
            System.out.println("You have to choose a Seed");
        else
            Field.getInstance().plant((Fruit) (entityType), court.getIndex());
    }

    @Override
    public String getName() {
        return "Plant seeds";
    }
}
