package game.back;

import ui.UIObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amir on 5/14/2017.
 * AHAY
 */
public class BackStack {
    private static BackStack ourInstance = new BackStack();

    public static BackStack getInstance() {
        return ourInstance;
    }

    private BackStack() {
    }

    private List<UIObject> stack = new ArrayList<>();



    public void clear() {
        stack.clear();
    }

    public void add(UIObject object) {
        stack.add(object);
    }

    public void back() {
        if (!stack.isEmpty()) stack.remove(getLastIndex());
    }

    public boolean isNotEmpty(){
        return !stack.isEmpty();
    }

    private int getLastIndex() {
        return stack.size() - 1;
    }

    public UIObject last() {
        if (!stack.isEmpty()) return stack.get(getLastIndex());
        return null;
    }
}
