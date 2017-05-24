package game.action.simple.picker;

import game.entities.type.storage.Backpack;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class BackPackPicker extends StoragePicker {

    public BackPackPicker() {
        super("BackPack Items", Backpack.getInstance());
    }
}
