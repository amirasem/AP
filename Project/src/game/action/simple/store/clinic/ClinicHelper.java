package game.action.simple.store.clinic;

import game.entities.Eatable;
import game.entities.type.eatable.Potion;

import java.util.ArrayList;

/**
 * Created by AmirHosein on 7/5/2017.
 * ASAY
 */
public class ClinicHelper {
    static ArrayList<Eatable> getList() {
        ArrayList<Eatable> l = new ArrayList<>();
        for (Potion p : Potion.values()) l.add(new Eatable(p));
//        for (Fruit f : Fruit.values()) l.add(new Eatable(f));
//        for (Foods f : Foods.values()) l.add(new Eatable(f));
        return l;
    }
    static ArrayList<Eatable> getListForHealUp(){
        ArrayList<Eatable>  l = new ArrayList<>();
        l.add(new Eatable(Potion.HEALUP));
        return l;
    }
}
