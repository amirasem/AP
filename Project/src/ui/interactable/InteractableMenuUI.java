package ui.interactable;

import game.action.api.Action;
import game.interactable.Interactable;
import ui.menu.ActionUI;
import ui.menu.IndexMenuUI;

import java.util.ArrayList;

/**
 * Created by ahay on 5/2/17.
 * <p>
 * GIBILI GIBILI
 */
public class InteractableMenuUI extends IndexMenuUI{
    private static ActionUI[] generateActionUIs(Interactable interactable) {
        ArrayList<Action> actions = interactable.getActions();
        ActionUI[] out = new ActionUI[actions.size()];
        for (int i = 0; i < actions.size(); i++)
            out[i] = new ActionUI(actions.get(i), actions.get(i).getName());
        return out;
    }

    public InteractableMenuUI(String title, Interactable interactable) {
        super(title, generateActionUIs(interactable));
    }
}
