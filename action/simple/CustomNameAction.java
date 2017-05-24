package game.action.simple;

import game.interactable.Interactable;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class CustomNameAction extends Interact {
    private final String name;


    public CustomNameAction(Interactable interactable, String name) {
        super(interactable);
        this.name = name;
    }
}
