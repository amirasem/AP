package ui.menu;

import game.action.api.Action;

/**
 * Created by ahay on 5/1/17.
 * GIBILI GIBILI
 */
public class ActionUI {
    private final Action action;
    private final String name;

    public ActionUI(Action action, String name) {
        this.action = action;
        this.name = name;
    }

    public void show(int index) {
        System.out.println(index + "." + name);
    }

    public void noIndexShow(){
        System.out.println(name);
    }

    public void run() {
        action.happen();
    }
}
