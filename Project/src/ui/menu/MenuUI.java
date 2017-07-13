package ui.menu;

import ui.UI;

/**
 * Created by ahay on 5/1/17.
 * GIBILI GIBILI
 */
public abstract class MenuUI implements UI {
    final String title;
    protected final ActionUI[] actions;

    public MenuUI(String title, ActionUI[] actions) {
        this.title = title;
        this.actions = actions;
    }

    public void run(int index) {
        actions[index].run();
    }

    boolean isNotEmpty() {
        return size() != 0;
    }

    int size() {
        return actions.length;
    }
}
