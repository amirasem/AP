package game.action.simple;

import game.action.api.Action;
import ui.command.CommandLineHelper;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class PermissionAction implements Action {
    private final Action action;
    private final String text;

    public PermissionAction(Action action, String text) {
        this.action = action;
        this.text = text;
    }

    @Override
    public boolean isActionValid() {
        return action.isActionValid();
    }

    @Override
    public void happen() {
        System.out.println(text);
        String p = CommandLineHelper.getInstance().next();
        if (p.equals("y")) action.happen();
    }

    @Override
    public String getName() {
        return action.getName();
    }
}
