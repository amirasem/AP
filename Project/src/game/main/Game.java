package game.main;

import game.action.ActionHelper;
import game.action.simple.Interact;
import game.action.simple.Move;
import game.back.BackStack;
import game.entities.type.eatable.Fruit;
import game.entities.type.storage.Backpack;
import game.exception.InvalidItemException;
import game.exception.InvalidTargetException;
import game.interactable.Interactable;
import game.interactable.InteractableHelper;
import game.places.Place;
import game.places.PlaceHelper;
import game.places.Village;
import game.time.Watch;
import game.time.daytime.ChangeTime;
import game.time.farmer.Sleep;
import game.time.farmer.WakeUp;
import game.time.season.ChangeSeason;
import ui.UIObject;

/**
 * Created by ahay on 5/1/17.
 * GIBILI GIBILI
 */
public class Game {
    private Place place = Village.getInstance();

    private static Game ourInstance = new Game();

    public static Game getInstance() {
        return ourInstance;
    }

    private Game() {
    }

    public void setPlace(Place place) {
        this.place = place;
        show();
    }

    public void setInteractable(Interactable interactable) {
        setUIObject(interactable);
    }

    public void setUIObject(UIObject UIObject) {
        BackStack.getInstance().add(UIObject);
    }

    public Place getPlace() {
        return place;
    }

    public void initiate() {
        PlaceHelper.getInstance().run();
        InteractableHelper.getInstance().run();
        ActionHelper.getInstance().run();
        Backpack.getInstance().put(Fruit.APPLE , 1);
        Backpack.getInstance().put(Fruit.ORANGE , 1);
        Backpack.getInstance().put(Fruit.ORANGE , 1);
        Backpack.getInstance().put(Fruit.CARROT , 1);
        Backpack.getInstance().put(Fruit.CARROT  , 1);
        Backpack.getInstance().put(Fruit.APPLE , 1);
        Backpack.getInstance().put(Fruit.APPLE , 1);
        Backpack.getInstance().put(Fruit.APPLE , 1);
        Backpack.getInstance().put(Fruit.TURNIP , 2);
        Backpack.getInstance().put(Fruit.CARROT , 1);
        //TODO : har che ghadr valur bedi farghi nemikone faghat ye done ezafe mishe

     //   new ChangeSeason().execute();
        // new PutAction(Fruit.APPLE , 2 , Backpack.getInstance());
       // Watch.getInstance().run();
        show();
       // Watch.getInstance().add(new ChangeSeason());
       // Watch.getInstance().run();
    }
    public void timeInitiate(){
//       new ChangeSeason().execute();
//       new ChangeTime().execute();
        Watch.getInstance().add(new ChangeTime());
        Watch.getInstance().add(new ChangeSeason());
        Watch.getInstance().add(new Sleep());
        Watch.getInstance().add(new WakeUp());
        Watch.getInstance().run();
    }

    public void goTo(String place) {
        try {
            new Move(this.place, this.place.findPlace(place)).happen();
            //show();
        } catch (InvalidTargetException e) {
            System.out.println(e.getMessage());
        }
    }

    public void inspect(String item) {
        try {
            BackStack.getInstance().clear();
            new Interact(place.findIntractable(item)).happen();
            show();
        } catch (InvalidItemException e) {
            System.out.println(e.getMessage());
        }
    }

    public void show() {
        UIObject ui = getUIObject();
        if (ui != null) ui.getUI().show();
        else place.getUI().show();
    }

    public UIObject getUIObject() {
        if (BackStack.getInstance().isNotEmpty()) return BackStack.getInstance().last();
        return place;
    }

    public void back() {
        BackStack.getInstance().back();
        show();
    }
}
