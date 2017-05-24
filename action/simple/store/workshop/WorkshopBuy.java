package game.action.simple.store.workshop;

import game.action.complex.buy.Buy;
import game.action.simple.picker.GoodsAndPrices;
import game.action.simple.picker.StorePicker;
import game.action.simple.store.BuyStore;
import game.entities.Eatable;
import game.entities.Entity;
import game.entities.Instrument;
import game.entities.type.api.EntityType;
import game.entities.type.eatable.api.EatableEntityType;
import ui.command.CommandLineHelper;

import java.util.ArrayList;

/**
 * Created by AmirHosein on 5/24/2017.
 */
public class WorkshopBuy extends BuyStore {
    public WorkshopBuy() {
        super(WorkshopHelper.getList());
    }

    @Override
    public void happen() {

        GoodsAndPrices goodsAndPrices = new StorePicker("Make an item", getListOfItemsFromEntities(list)).choose();
        EntityType entity = goodsAndPrices.getType();
        System.out.println("How many do you want to make?");
        int x = CommandLineHelper.getInstance().nextInt();
        Buy buy = new Buy(new Instrument(entity), goodsAndPrices.getMoney(), x);
        if (buy.isActionValid()) {
            System.out.println("You will make x" + x + " for " + (x * goodsAndPrices.getMoney()) + " Gil. Is that okay?");
            if (CommandLineHelper.getInstance().next().equals("Y")) {
                buy.happen();
            }
        }
    }

    @Override
    public String getName() {
        return "Make a tool";
    }
}
