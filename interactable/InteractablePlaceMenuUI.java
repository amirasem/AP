package ui.interactable;

import game.action.simple.Interact;
import game.interactable.Interactable;
import game.places.Place;
import ui.menu.ActionUI;
import ui.menu.NoIndexMenuUI;

import java.util.ArrayList;

/**
 * Created by ahay on 5/2/17.
 * <p>
 * <p>
 * GIBILI GIBILI
 */
public class InteractablePlaceMenuUI extends NoIndexMenuUI {
    private static ActionUI[] generateActionUIs(Place place) {
        ArrayList<Interactable> interactables = place.getInteractableObjects();
        ActionUI[] out = new ActionUI[interactables.size()];
        for (int i = 0; i < interactables.size(); i++)
            out[i] = new ActionUI(new Interact(interactables.get(i)), interactables.get(i).getName());
        return out;
    }

    public InteractablePlaceMenuUI(Place place) {
        super("Objects you can interact with", generateActionUIs(place));
    }
}
