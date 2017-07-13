package ui.place;

import game.places.AbstractPlace;
import game.places.Place;
import ui.interactable.InteractableMenuUI;
import ui.interactable.InteractablePlaceMenuUI;
import ui.menu.MenuUI;
import ui.menu.MultipleMenuUi;

/**
 * Created by ahay on 5/1/17.
 * GIBILI GIBILI
 */
public class PlaceUI extends MultipleMenuUi {
    private final Place place;

    public PlaceUI(AbstractPlace place) {
        super(new MenuUI[]{new InteractableMenuUI(place.getName(), place),
                new PlaceMenuUI(place),
                new InteractablePlaceMenuUI(place)});
        this.place = place;
    }

    @Override
    public void show() {
        System.out.println("You are currently in " + place.name());
        super.show();
    }
}
