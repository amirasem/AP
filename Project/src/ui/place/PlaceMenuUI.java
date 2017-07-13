package ui.place;

import game.action.simple.Move;
import game.places.Place;
import ui.menu.ActionUI;
import ui.menu.NoIndexMenuUI;

import java.util.ArrayList;

/**
 * Created by ahay on 5/1/17.
 * GIBILI GIBILI
 */
class PlaceMenuUI extends NoIndexMenuUI {
    private static ActionUI[] generateActionUIs(Place place) {
        ArrayList<Place> places = place.getPlacesWeCanGo();
        ActionUI[] out = new ActionUI[places.size()];
        for (int i = 0; i < places.size(); i++)
            out[i] = new ActionUI(new Move(place, places.get(i)), places.get(i).name());
        return out;
    }

    PlaceMenuUI(Place place) {
        super("Places you can go", generateActionUIs(place));
    }
}
