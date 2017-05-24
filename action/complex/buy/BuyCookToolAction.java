package game.action.complex.buy;

import game.action.api.Action;
import game.action.simple.put.PutAction;
import game.action.simple.take.TakeMoneyAction;
import game.entities.type.instrument.cook.CookTool;
import game.entities.type.living.Farmer;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public enum BuyCookToolAction implements Action {
    BUY_COOK_PAN(100),
    BUY_COOK_AGITATOR(100),
    BUY_COOK_POT(100),
    BUY_COOK_KNIFE(100),
    BUY_COOK_OVEN(100),;

    private final Action[] actions ;
    private final int money;
    BuyCookToolAction(int money) {
        this.money = money;
        CookTool cookTool = BuyHelperName.getInstance().getCookTool(name());
        this.actions = new Action[2];
        if (cookTool!=null) {
            this.actions[0] = new TakeMoneyAction(money);//new TakeAction(prevTool, 1, Farmer.getInstance().getBackpack());
//            this.actions[1] = new PutAction(cookTool,1,Farmer.getInstance().getBackpack());//new PutAction(nextTool, 1, Farmer.getInstance().getBackpack());
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
