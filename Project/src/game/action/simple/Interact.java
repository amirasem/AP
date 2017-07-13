package game.action.simple;

import game.main.Game;
import game.action.api.Action;
import game.interactable.Interactable;

/**
 * Created by ahay on 5/2/17.
 * <p>
 * GIBILI GIBILI
 */
public class Interact implements Action {
    private final Interactable interactable;

    public Interact(Interactable interactable) {
        this.interactable = interactable;
    }

    @Override
    public boolean isActionValid() {
        return Game.getInstance().getPlace().getInteractableObjects().contains(interactable);
    }

    @Override
    public void happen() {
        Game.getInstance().setInteractable(interactable);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}