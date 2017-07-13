package game.action.complex.buy;

import game.action.api.Action;
import game.action.simple.put.PutAction;
import game.action.simple.take.TakeMoneyAction;
import game.entities.type.eatable.CookMaterial;
import game.entities.type.living.Farmer;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public enum BuyCookMaterialAction implements Action {
    BUY_COOK_SUGAR(100),
    BUY_COOK_OIL(100),
    BUY_COOK_SALT(100),
    BUY_COOK_PAPER(100),
    BUY_COOK_MEAT(100),
    BUY_COOK_EGG(100),
    BUY_COOK_CHEESE(100),
    BUY_COOK_MILK(100),
    BUY_COOK_VEGETABLES(100),
    BUY_COOK_LEMON_JUICE(100),
    BUY_COOK_FRUIT_JUICE(100);

    private final Action[] actions;
    private final int money;

    BuyCookMaterialAction(int money) {
        this.money = money;
        CookMaterial cookMaterial = BuyHelperName.getInstance().getMaterial(name());
        actions = new Action[2];
        if (cookMaterial != null) {
            actions[0] = new TakeMoneyAction(money);
//            actions[1] = new PutAction(cookMaterial, 1, Farmer.getInstance().getBackpack());
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
        return name();
    }
}
