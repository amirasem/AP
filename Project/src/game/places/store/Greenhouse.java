package game.places.store;

import game.action.api.Action;
import game.action.api.ActionHandler;
import game.interactable.field.Field;
import game.interactable.WheatherMachine;
import game.main.Game;
import game.places.AbstractPlace;
import ui.UI;
import ui.place.GreenHouseUI;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public class Greenhouse extends AbstractPlace implements ActionHandler {
    private static Greenhouse ourInstance = new Greenhouse();
    private boolean isRepaired = false;

    public static Greenhouse getInstance() {
        return ourInstance;
    }

    private Greenhouse() {
        super();
    }

    @Override
    public UI getUI() {
        return new GreenHouseUI();
    }

    @Override
    public boolean permitAction(Action action) {
        return !isRepaired;
    }

    @Override
    public void receiveAction(Action action) {
        isRepaired = true;
        getRepaired();
    }

    private void getRepaired() {
        addIntractable(WheatherMachine.getInstance());
        addIntractable(Field.getInstance());
        actions.clear();
        Game.getInstance().setPlace(this);
    }


}
