package game.action.simple.store.butchery;

import game.action.complex.buy.Buy;
import game.action.simple.picker.GoodsAndPrices;
import game.action.simple.picker.StorePicker;
import game.action.simple.store.BuyStore;
import game.entities.type.api.EntityType;
import game.entities.type.noteatable.CoockMaterial;
import ui.command.CommandLineHelper;

/**
 * Created by AmirHosein on 5/24/2017.
 */
public class ButcheryBuyStore extends BuyStore {
    public ButcheryBuyStore() {
        super(ButcheryStoreHelper.getList());
    }

    @Override
    public void happen() {
        GoodsAndPrices goodsAndPrices = new StorePicker("Buy an item", getListOfItemsFromEntities(list)).choose();
        EntityType entity = goodsAndPrices.getType();
        System.out.println("How many do you want to buy?");
        int x = CommandLineHelper.getInstance().nextInt();
        Buy buy = new Buy(new CoockMaterial(entity), goodsAndPrices.getMoney(), x);
        if (buy.isActionValid()) {
            System.out.println("You will buy x" + x + " for " + (x * goodsAndPrices.getMoney()) + " Gil. Is that okay?");
            if (CommandLineHelper.getInstance().next().equals("Y")) {
                buy.happen();
            }
        }
    }
}
