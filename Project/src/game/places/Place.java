package game.places;

import game.exception.InvalidItemException;
import game.exception.InvalidTargetException;
import game.interactable.Interactable;
import ui.UIObject;

import java.util.ArrayList;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public interface Place extends UIObject {
    ArrayList<Place> getPlacesWeCanGo();

    void addIntractable(Interactable interactable);

    String name();

    boolean equalsStr(String placeName);

    Place findPlace(String placeName) throws InvalidTargetException;

    Interactable findIntractable(String itemName) throws InvalidItemException;

    ArrayList<Interactable> getInteractableObjects();

    void addPlace(Place abstractPlace);
}
