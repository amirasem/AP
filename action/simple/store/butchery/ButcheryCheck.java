package game.action.simple.store.butchery;

import game.action.simple.store.Check;

/**
 * Created by AmirHosein on 5/24/2017.
 */
public class ButcheryCheck extends Check {
    public ButcheryCheck() {
        super(ButcheryStoreHelper.getList());
    }
}
