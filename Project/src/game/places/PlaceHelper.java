package game.places;

import game.places.store.*;

/**
 * Created by ahay on 5/1/17.
 * GIBILI GIBILI
 */
public class PlaceHelper {

    private boolean hasBeenAdded = false;
    private static PlaceHelper ourInstance = new PlaceHelper();

    public static PlaceHelper getInstance() {
        return ourInstance;
    }

    private PlaceHelper() {
    }

    private void addPlaces(Place place, Place... places) {
        for (Place p : places) addPlace(place, p);
    }

    private void addPlace(Place place1, Place place2) {
        place1.addPlace(place2);
        place2.addPlace(place1);
    }

    public void run() {
        if (!hasBeenAdded) {
            hasBeenAdded = true;
            addPlaces(Farm.getInstance(), Barn.getInstance(), Home.getInstance(), Jungle.getInstance()
                    , Greenhouse.getInstance(), Village.getInstance());
            addPlaces(Village.getInstance(), Market.getInstance(), Gym.getInstance(), Workshop.getInstance(),
                    Clinic.getInstance(), Ranch.getInstance(), Cafe.getInstance(), Laboratory.getInstance());
            addPlaces(Jungle.getInstance(), Cave.getInstance());
        }
    }
}
