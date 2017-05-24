package game.action.simple.field.empty;

import game.interactable.field.EmptyCourt;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class Status extends EmptyCourtAction {
    public Status(EmptyCourt court) {
        super(court);
    }

    @Override
    public boolean isActionValid() {
        return true;
    }

    @Override
    public void happen() {
        System.out.println("Plowed: \t" + court.isPlowed());
        System.out.println("Watered: \t" + court.isWatered());
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
