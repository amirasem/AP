package game.interactable;

import game.entities.type.storage.Backpack;
import game.entities.type.storage.StorageBox;
import game.interactable.cafe.DiningTable;
import game.interactable.cafe.MissionBoard;
import game.interactable.field.Field;
import game.places.*;
import game.places.store.Cafe;

/**
 * Created by ahay on 5/2/17.
 * <p>
 * GIBILI GIBILI
 */
public class InteractableHelper {
    private static InteractableHelper ourInstance = new InteractableHelper();

    public static InteractableHelper getInstance() {
        return ourInstance;
    }

    private InteractableHelper() {
    }

    private boolean hasBeenAdded = false;

    private void addIntractable(Place place1, Interactable interactable) {
        place1.addIntractable(interactable);
    }

    private void addIntractables(Place place, Interactable... interactables) {
        for (Interactable i : interactables) addIntractable(place, i);
    }

    //    TODO: Complete
    public void run() {
        if (!hasBeenAdded) {
            hasBeenAdded = true;
            addIntractables(Market.getInstance(), Butchery.getInstance(), GroceryStore.getInstance(), GeneralStore.getInstance());
            addIntractables(Jungle.getInstance(), River.getInstance());
            addIntractables(Farm.getInstance(), Pond.getInstance(), Field.getInstance(), FruitGarden.getInstance());
            addIntractables(Home.getInstance(), StorageBox.getInstance());
            addIntractables(Home.getInstance(), Kitchen.getInstance());
            addIntractables(Farm.getInstance(), Backpack.getInstance());
            addIntractables(Home.getInstance(), Bed.getInstance());
            addIntractables(Cave.getInstance(), Rocks.getInstance());
            addIntractables(Jungle.getInstance(), Woods.getInstance());
            addIntractables(Jungle.getInstance(), Rocks.getInstance());
            addIntractables(Cafe.getInstance(), MissionBoard.getInstance());
            addIntractables(Cafe.getInstance(), DiningTable.getInstance());
            addIntractables(Barn.getInstance(), Machine.getInstance());
            //6
            // addIntractables(Farm.getInstance() , Field.getInstance() , FruitGarden.getInstance() , Pond.getInstance());
        }
    }
}
