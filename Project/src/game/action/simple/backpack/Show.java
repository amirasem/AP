package game.action.simple.backpack;

import game.action.api.Action;
import game.entities.type.storage.Backpack;
import game.interactable.AbstractInteractable;
import ui.UI;

/**
 * Created by AmirHosein on 7/4/2017.
 * ASAY
 */
public class Show extends AbstractInteractable implements Action {

    public Show(){
        happen();
    }
    @Override
    public boolean isActionValid() {
        return true;
    }

    @Override
    public void happen() {
        for (int i = 0; i < Backpack.getInstance().getStoredItems().size(); i++) {

            System.out.println(i + "." + Backpack.getInstance().getStoredItems().get(i).getEntity());
        }
    }
    public String items(){
        for (int i = 0; i < Backpack.getInstance().getStoredItems().size(); i++) {
            return i + "." + Backpack.getInstance().getStoredItems().get(i).getEntity();
        }
        return null;
    }

    @Override
    public String getName() {
        return "Show";
    }

    @Override
    public UI getUI() {
        return null;
    }
}
