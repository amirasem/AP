package game.action.simple.field.empty;

import game.action.simple.picker.StoragePicker;
import game.entities.type.api.EntityType;
import game.entities.type.instrument.farm.Shovel;
import game.interactable.field.EmptyCourt;
import game.entities.type.living.Farmer;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class Plow extends EmptyCourtAction {
    public Plow(EmptyCourt court) {
        super(court);
    }

    @Override
    public boolean isActionValid() {
        return true;
    }

    @Override
    public void happen() {
        EntityType entityType = new StoragePicker("Shovel", Farmer.getInstance().getBackpack()).choose().getType();
        if (!entityType.getClass().isInstance(Shovel.class)) {
            System.out.println("You have to choose a Shovel");
        } else {
//            TODO: Broken
            court.getPlowed();
        }

    }

    @Override
    public String getName() {
        return "Plow this field";
    }
}
