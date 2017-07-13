package game.interactable;

import game.action.simple.CustomNameInteract;
import game.action.simple.take.TakeAction;
import game.entities.type.eatable.Fruit;
import game.entities.type.requirement.PairOfEntityValue;
import game.entities.type.storage.Backpack;
import game.interactable.field.AbstractCourt;
import game.interactable.field.EmptyCourt;
import game.interactable.field.FruitCourt;
import ui.UI;
import ui.interactable.GardenUI;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public class FruitGarden extends AbstractInteractable {

    private static FruitGarden ourInstance = new FruitGarden();
    private static final int MAX = 10;
    AbstractCourt[] courts = new AbstractCourt[MAX];

    public static FruitGarden getInstance() {
        return ourInstance;
    }

//    private FruitGarden() {
//        super(     );
//    }
//    public void goTOFarm(){return;}
//    public void interactWithTrees(){return;}
private FruitGarden() {
    super();
    for (int i = 0; i < MAX; i++) courts[i] = new EmptyCourt(i);
}

    public void plant(Fruit fruit, int index) {
        if (courts[index].getClass().equals(EmptyCourt.class)) courts[index] = new FruitCourt(fruit);
        actions.clear();
        for (PairOfEntityValue p : Backpack.getInstance().getStoredItems()){
            addAction(new TakeAction(p.getEntity() , p.getValue() , Backpack.getInstance()));
        }
    }
    @Override
    public UI getUI() {
        actions.clear();
        for (AbstractCourt court : courts) actions.add(new CustomNameInteract(court, court.getName()));
        return new GardenUI();
    }
}
