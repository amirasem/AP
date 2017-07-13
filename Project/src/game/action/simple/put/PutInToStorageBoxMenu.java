package game.action.simple.put;

import game.action.simple.backpack.Show;
import game.action.simple.picker.BackPackPicker;
import game.entities.type.requirement.PairOfEntityValue;
import game.entities.type.storage.Backpack;
import game.entities.type.storage.StorageBox;
import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.entities.PutInToStorageBoxMenuUI;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by ahay on 5/6/17.
 * <p>
 * GIBILI GIBILI
 */
public class PutInToStorageBoxMenu extends AbstractInteractable {


    @Override
    public UI getUI() {
    //    new BackPackPicker().print();
//        System.out.println("salam");
        actions.clear();
      //  print();
        new Show();
        return new PutInToStorageBoxMenuUI(this);
    }
}
