package game.interactable.field;

import game.entities.type.eatable.Fruit;
import ui.UI;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class FruitCourt extends AbstractCourt {

    private final Fruit fruit;

    public FruitCourt(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public UI getUI() {
        return null;
    }

    @Override
    public String getName() {
        return fruit.name() + " Field";
    }
}
