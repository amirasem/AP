package game.action.simple.store.workshop;

import game.action.simple.store.Check;
import game.entities.Entity;

import java.util.ArrayList;

/**
 * Created by AmirHosein on 5/24/2017.
 */
public class WorkshopCheck extends Check {
    public WorkshopCheck() {
        super(WorkshopHelper.getList());
    }
}
