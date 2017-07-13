package game.places;

import game.exception.InvalidItemException;
import game.exception.InvalidTargetException;
import game.interactable.AbstractInteractable;
import game.interactable.Interactable;

import java.util.ArrayList;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public abstract class AbstractPlace extends AbstractInteractable implements Place {
    private final ArrayList<Place> placesWeCanGo;
    protected final ArrayList<Interactable> interactableObjects;

    protected AbstractPlace() {
        this.placesWeCanGo = new ArrayList<>();
        this.interactableObjects = new ArrayList<>();
    }

    @Override
    public ArrayList<Place> getPlacesWeCanGo() {
        return placesWeCanGo;
    }

    @Override
    public void addIntractable(Interactable interactable) {
        if (interactableObjects.contains(interactable)) return;
        interactableObjects.add(interactable);
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean equalsStr(String placeName) {
        return name().equals(placeName);
    }

    @Override
    public Place findPlace(String placeName) throws InvalidTargetException {
        for (Place p : placesWeCanGo) if (p.equalsStr(placeName)) return p;
        throw new InvalidTargetException();
    }

    @Override
    public Interactable findIntractable(String itemName) throws InvalidItemException {
        for (Interactable i : interactableObjects) if (i.equalsStr(itemName)) return i;
        throw new InvalidItemException();
    }

    @Override
    public ArrayList<Interactable> getInteractableObjects() {
        return interactableObjects;
    }

    @Override
    public void addPlace(Place place) {
        if (placesWeCanGo.contains(place)) return;
        placesWeCanGo.add(place);
    }
}