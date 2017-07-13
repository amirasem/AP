package game.action.simple.store.ranch;

import game.action.simple.store.Check;
import game.entities.Entity;

import java.util.ArrayList;

/**
 * Created by AmirHosein on 7/5/2017.
 * ASAY
 */
public class RanchCheck  extends Check{
    public RanchCheck() {
        super(RanchHelper.getList());
    }
}
