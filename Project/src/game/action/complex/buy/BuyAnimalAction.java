package game.action.complex.buy;

import game.action.api.Action;
import game.action.simple.put.PutAction;
import game.action.simple.take.TakeMoneyAction;
import game.entities.type.storage.BarnStorage;
import game.interactable.AbstractInteractable;
import game.entities.type.living.animal.AnimalType;
import ui.UI;
import ui.interactable.BuyAnimalActionMenuUI;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public class BuyAnimalAction extends AbstractInteractable implements Action {
    private final Action[] actions;
    private final int money;
    private final String name;

    public BuyAnimalAction(String name, int money) {
        this.money = money;
        this.name = name;
        this.actions = new Action[2];
        AnimalType animalType = BuyHelperName.getInstance().getAnimal(name);
        if (animalType != null) {
            actions[0] = new TakeMoneyAction(money);
//            actions[1] = new PutAction(animalType, 1, BarnStorage.getInstance());
        }
    }

    @Override
    public boolean isActionValid() {
        return false;
    }

    @Override
    public void happen() {

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public UI getUI() {
        return new BuyAnimalActionMenuUI(this);
    }

    public int getMoney() {
        return money;
    }
}
