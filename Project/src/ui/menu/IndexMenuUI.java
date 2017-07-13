package ui.menu;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class IndexMenuUI extends MenuUI {
    public IndexMenuUI(String title, ActionUI[] actions) {
        super(title, actions);
    }

    @Override
    public void show() {
        System.out.println(title + ":");
        for (int i = 0; i < actions.length; i++) actions[i].show(i);
    }
}
