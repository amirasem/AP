package game.action.simple.store.groceries;

import game.action.complex.buy.Buy;
import game.action.simple.picker.GoodsAndPrices;
import game.action.simple.picker.StorePicker;
import game.action.simple.store.BuyStore;
import game.entities.Eatable;
import game.entities.type.api.EntityType;
import game.entities.type.eatable.api.EatableEntityType;
import ui.command.CommandLineHelper;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class GroceriesBuyStore extends BuyStore {
    public GroceriesBuyStore() {
        super(GroceriesStoreHelper.getList());
    }


    @Override
    public void happen() {

        GoodsAndPrices goodsAndPrices = new StorePicker("Buy an item", getListOfItemsFromEntities(list)).choose();
        EntityType entity = goodsAndPrices.getType();
        System.out.println("How many do you want to buy?");
        int x = CommandLineHelper.getInstance().nextInt();
        Buy buy = new Buy(new Eatable((EatableEntityType) entity), goodsAndPrices.getMoney(), x);
        if (buy.isActionValid()) {
            System.out.println("You will buy x" + x + " for " + (x * goodsAndPrices.getMoney()) + " Gil. Is that okay?");
            if (CommandLineHelper.getInstance().next().equals("Y")) {
                buy.happen();
            }
        }

    }

}
