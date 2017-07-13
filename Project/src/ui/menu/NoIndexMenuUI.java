package ui.menu;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class NoIndexMenuUI extends MenuUI{
    public NoIndexMenuUI(String title, ActionUI[] actions) {
        super(title, actions);
    }

    @Override
    public void show() {
        System.out.println(title + ":");
        for (ActionUI action : actions) action.noIndexShow();
    }
}
