package game.entities.type.storage;

import game.action.api.Action;
import game.action.api.ActionHandler;
import game.action.simple.put.PutAction;
import game.action.simple.take.TakeAction;
import game.entities.Entity;
import game.entities.type.requirement.PairOfEntityValue;
import game.interactable.AbstractInteractable;

import java.util.ArrayList;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public abstract class AbstractStorage extends AbstractInteractable implements ActionHandler {
    private final ArrayList<PairOfEntityValue> storedItems;
    private final int capacity;

    AbstractStorage(int capacity) {
        this.capacity = capacity;
        this.storedItems = new ArrayList<>();
    }

    public boolean has(Entity entity, int value) {
//        for (PairOfEntityValue entityValue : storedItems) if (entityValue.matches(entity, value)) return true;
        return false;
    }

    public abstract boolean hasCapacityFor(Entity entity, int value);

    public void take(Entity entity, int value) {
//        TODO:
        storedItems.remove(new PairOfEntityValue(entity, value));
    }

    public void put(Entity entity, int value) {
//        TODO: Check the size and capacity !
        storedItems.add(new PairOfEntityValue(entity, value));
    }

    public void clear() {
        storedItems.clear();
    }

    @Override
    public boolean permitAction(Action action) {
        if (action.getClass().equals(TakeAction.class)) return permitTake((TakeAction) action);
        if (action.getClass().equals(PutAction.class)) return permitPut((PutAction) action);
        return false;
    }

    private boolean permitPut(PutAction action) {
        PutAction putAction = action;
        return hasCapacityFor(putAction.getEntity(), putAction.getValue());
    }

    private boolean permitTake(TakeAction action) {
        TakeAction takeAction = action;
        return has(takeAction.getEntity(), takeAction.getValue());
    }

    @Override
    public void receiveAction(Action action) {
        if (action.getClass().equals(TakeAction.class)) take((TakeAction) action);
        if (action.getClass().equals(PutAction.class)) put((PutAction) action);
    }

    private void put(PutAction action) {
        PutAction putAction = action;
        put(putAction.getEntity(), putAction.getValue());
    }

    private void take(TakeAction action) {
        TakeAction takeAction = action;
        take(takeAction.getEntity(), takeAction.getValue());
    }

    public ArrayList<PairOfEntityValue> getStoredItems() {
        return storedItems;
    }
}