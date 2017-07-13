package game.action.simple.store.ranch;

import game.action.complex.buy.Buy;
import game.action.simple.picker.GoodsAndPrices;
import game.action.simple.picker.StorePicker;
import game.action.simple.store.BuyStore;
import game.entities.Entity;
import game.entities.Instrument;
import game.entities.type.api.EntityType;
import ui.command.CommandLineHelper;

import java.util.ArrayList;

/**
 * Created by AmirHosein on 7/5/2017.
 * ASAY
 */
public class RanchBuyItem extends BuyStore{
    public RanchBuyItem() {
        super(RanchHelper.getListForBuyItem());
    }

    @Override
    public void happen() {
        GoodsAndPrices goodsAndPrices = new StorePicker("Buy an item", getListOfItemsFromEntities(list)).choose();
        EntityType entity = goodsAndPrices.getType();
        System.out.println("How many do you want to buy?");
        int x = CommandLineHelper.getInstance().nextInt();
        Buy buy = new Buy(new Instrument(entity), goodsAndPrices.getMoney(), x);
        if (buy.isActionValid()) {
            System.out.println("You will buy " +  goodsAndPrices.getStatus() + " x" + x + " for " + (x * goodsAndPrices.getMoney()) + " Gil. Is that okay?");
            if (CommandLineHelper.getInstance().next().equals("Y")) {
                buy.happen();
            }
        }

    }
}
