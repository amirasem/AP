package game.action.simple.store.clinic;

import game.action.simple.store.Check;
import game.entities.Entity;

import java.util.ArrayList;

/**
 * Created by AmirHosein on 7/5/2017.
 * ASAY
 */
public class ClinicCheck extends Check {
    public ClinicCheck() {
        super(ClinicHelper.getList());
    }
}
