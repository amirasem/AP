package game.action.simple.store.general;

import game.action.simple.store.Check;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class GeneralStoreCheck extends Check {
    public GeneralStoreCheck() {
        super(GeneralStoreHelper.getList());
    }
}
