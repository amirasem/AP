package game.interactable.field;

import game.action.simple.field.empty.Plant;
import game.action.simple.field.empty.Plow;
import game.action.simple.field.empty.Status;
import game.action.simple.field.empty.Water;
import ui.UI;
import ui.interactable.InteractableMenuUI;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class EmptyCourt extends AbstractCourt {
    private final int index;
    private boolean plowed = false;
    private boolean watered = false;

    public EmptyCourt(int index) {
        this.index = index;
        addAction(new Status(this));
        addAction(new Plant(this));
        addAction(new Plow(this));
        addAction(new Water(this));
    }

    @Override
    public UI getUI() {
        return new InteractableMenuUI(getName(), this);
    }

    @Override
    public String getName() {
        return "Empty Field";
    }

    public boolean isPlowed() {
        return plowed;
    }

    public boolean isWatered() {
        return watered;
    }

    public void getWatered() {
        watered = true;
    }

    public int getIndex() {
        return index;
    }

    public void getPlowed() {
        plowed = true;
    }
}
