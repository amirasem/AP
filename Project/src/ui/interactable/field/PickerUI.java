package ui.interactable.field;

import game.entities.type.storage.AbstractStorage;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class PickerUI {
    private final String title;
    private final AbstractStorage storage;

    public PickerUI(String title, AbstractStorage storage) {
        this.title = title;
        this.storage = storage;
    }

    public void show() {
        System.out.println("Choose a " + title);
        for (int i = 0; i < storage.getStoredItems().size(); i++)
            System.out.println(i + "." + storage.getStoredItems().get(i));
    }
}
