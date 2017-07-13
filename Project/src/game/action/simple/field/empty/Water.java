package game.action.simple.field.empty;

import game.action.simple.picker.StoragePicker;
import game.entities.type.api.EntityType;
import game.entities.type.instrument.farm.Sprinkler;
import game.interactable.field.EmptyCourt;
import game.entities.type.living.Farmer;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class Water extends EmptyCourtAction {
    public Water(EmptyCourt court) {
        super(court);
    }

    @Override
    public boolean isActionValid() {
        return true;
    }

    @Override
    public void happen() {
        EntityType entityType = new StoragePicker("Watering Can", Farmer.getInstance().getBackpack()).choose().getType();
        if (!entityType.getClass().isInstance(Sprinkler.class)) {
            System.out.println("You have to choose a Watering Can");
        } else {
            court.getWatered();
//            TODO:
        }
    }

    @Override
    public String getName() {
        return "Water this field";
    }
}
