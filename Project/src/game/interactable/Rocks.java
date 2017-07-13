package game.interactable;

import ui.UI;
import ui.interactable.RocksUI;

/**
 * Created by ahay on 5/8/17.
 * <p>
 * GIBILI GIBILI
 */
public class Rocks extends AbstractInteractable {
    private static Rocks ourInstance = new Rocks();

    public static Rocks getInstance() {
        return ourInstance;
    }

    public Rocks() {
    }

    @Override
    public UI getUI() {
        return new RocksUI(this);
    }
}
