package game.interactable;

import game.action.api.Action;
import ui.UIObject;

import java.util.ArrayList;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public interface Interactable extends UIObject {
    void addAction(Action action);

    ArrayList<Action> getActions();

    String getName();

    boolean equalsStr(String intractable);
}
