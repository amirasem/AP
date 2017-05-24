package game.action.simple;

import game.interactable.Interactable;

/**
 * Created by ahay on 5/6/17.
 * <p>
 * GIBILI GIBILI
 */
public class CustomNameInteract extends Interact {
    private final String name;

    public CustomNameInteract(Interactable interactable, String name) {
        super(interactable);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
