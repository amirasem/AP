package game.action.simple.picker;

import ui.command.CommandLineHelper;

import java.util.ArrayList;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class AbstractPicker<Type> {
    private final String title;
    private final ArrayList<Type> items;

    public AbstractPicker(String title, ArrayList<Type> items) {
        this.title = title;
        this.items = items;
    }


    public void print() {
        for (int i = 0; i < items.size(); i++) System.out.println(i + "." + items.get(i));
    }

    public Type choose() {
        System.out.println(title + ":");
        print();

        int index = Integer.parseInt(CommandLineHelper.getInstance().next());
        return items.get(index);
    }
}
