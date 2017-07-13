package game.interactable;

import game.action.api.Action;

import java.util.ArrayList;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public abstract class AbstractInteractable implements Interactable {
    protected final ArrayList<Action> actions = new ArrayList<>();

    @Override
    public void addAction(Action action) {
        if (!actions.contains(action)) actions.add(action);
    }

    @Override
    public ArrayList<Action> getActions() {
        return actions;
    }

    @Override
    public String getName() {
        return separate(getClass().getSimpleName());
    }

    private String separate(String str) {
        String out = "";
        for (String w : str.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")) out += w + " ";
        out = out.substring(0, out.length() - 1);
        return out;
    }

    @Override
    public boolean equalsStr(String intractable) {
        return getName().equals(intractable);
    }
}
