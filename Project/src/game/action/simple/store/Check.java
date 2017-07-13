package game.action.simple.store;

import game.action.simple.picker.StorePicker;
import game.entities.Entity;
import ui.command.CommandLineHelper;

import java.util.ArrayList;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class Check extends StoreAction {
    public Check(ArrayList<? extends Entity> list) {
        super(list);
    }

    @Override
    public boolean isActionValid() {
        return true;
    }

    @Override
    public void happen() {
        new StorePicker("Items :", getListOfItemsFromEntities(list)).print();
        int i = CommandLineHelper.getInstance().nextInt();
        System.out.println(list.get(i).getStatus());
    }

    @Override
    public String getName() {
        return "Check this shop";
    }
}
