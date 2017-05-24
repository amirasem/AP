package game.action.simple.store.general;

import game.action.complex.buy.Buy;
import game.action.simple.picker.GoodsAndPrices;
import game.action.simple.picker.StorePicker;
import game.action.simple.store.BuyStore;
import game.entities.Eatable;
import game.entities.Instrument;
import game.entities.type.api.EntityType;
import game.entities.type.eatable.api.EatableEntityType;
import game.entities.type.instrument.api.Tool;
import ui.command.CommandLineHelper;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class GeneralStoreBuy extends BuyStore {
    public GeneralStoreBuy() {
        super(GeneralStoreHelper.getList());
    }

    @Override
    public void happen() {
        GoodsAndPrices goodsAndPrices = new StorePicker("BuyStore an item", getListOfItemsFromEntities(list)).choose();
        EntityType entity = goodsAndPrices.getType();
        System.out.println("How many do you want to buy?");
        int x = CommandLineHelper.getInstance().nextInt();
        Buy buy = new Buy(new Instrument(entity), goodsAndPrices.getMoney(), x);
        if (buy.isActionValid()) {
            System.out.println("You will buy x" + x + " for " + (x * goodsAndPrices.getMoney()) + " Gil. Is that okay?");
            if (CommandLineHelper.getInstance().next().equals("Y")) {
                buy.happen();
            }
        }
    }
}
