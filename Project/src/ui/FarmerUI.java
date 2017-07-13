package ui;

import game.animals.properties.LivingPropertyType;
import game.entities.type.storage.Backpack;
import game.entities.type.living.Farmer;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class FarmerUI implements UI {
    private final Farmer farmer ;
    private final Backpack backpack;
    private final LivingPropertyType livingPropertyType;
    private final int money ;

    public FarmerUI(Farmer farmer, Backpack backpack, LivingPropertyType livingPropertyType, int money) {
        this.farmer = farmer;
        this.backpack = backpack;
        this.livingPropertyType = livingPropertyType;
        this.money = money;
    }

    @Override
    public void show() {

    }

    @Override
    public void run(int index) {

    }
}
