package ui.interactable;

import game.interactable.field.Field;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class FieldUI extends InteractableMenuUI {


    public FieldUI() {
        super("Field " , Field.getInstance());
    }
}
