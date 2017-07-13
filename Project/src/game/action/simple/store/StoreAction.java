package game.action.simple.store;

import game.action.api.Action;
import game.action.simple.picker.GoodsAndPrices;
import game.entities.Entity;
import game.entities.type.api.EntityType;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public abstract class StoreAction implements Action {
    protected final ArrayList<? extends Entity> list;

    protected StoreAction(ArrayList<? extends Entity> list) {
        this.list = list;
    }

    protected ArrayList<GoodsAndPrices> getListOfItemsFromEntities(ArrayList<? extends Entity> goods) {
        ArrayList<EntityType> types = goods.stream().map(Entity::getType).collect(Collectors.toCollection(ArrayList::new));
        return getListOfItems(types);
    }

    private ArrayList<GoodsAndPrices> getListOfItems(ArrayList<? extends EntityType> goods) {
        ArrayList<GoodsAndPrices> out = new ArrayList<>();
        for (EntityType t : goods) out.add(new GoodsAndPrices(t.getPrice(), t));
        return out;
    }
}
