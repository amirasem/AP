package game.interactable.field;

import game.action.simple.CustomNameInteract;
import game.action.simple.take.TakeAction;
import game.entities.type.eatable.Fruit;
import game.entities.type.requirement.PairOfEntityValue;
import game.entities.type.storage.Backpack;
import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.FieldUI;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class Field extends AbstractInteractable {
    private final static int MAX = 10;
    AbstractCourt[] courts = new AbstractCourt[MAX];
    private static Field ourInstance = new Field();

    public static Field getInstance() {
        return ourInstance;
    }

    private Field() {
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
        return new FieldUI();
    }
}
