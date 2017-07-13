package game.entities.type.eatable;

import game.animals.properties.Live;
import game.animals.properties.LivingPropertyType;
import game.animals.properties.values.LivingPropertyValueType;
import game.entities.type.api.LivingPropertyChanger;
import game.entities.type.eatable.api.EatableEntityType;
import game.environment.Season;

/**
 * Created by AmirHosein on 5/22/2017.
 */
public enum  OtherEatable implements EatableEntityType {
    MILK(60, new LivingPropertyChanger(20 , LivingPropertyType.ENERGY, LivingPropertyValueType.CURRENT) ,
            new LivingPropertyChanger(20 , LivingPropertyType.HEALTH,LivingPropertyValueType.CURRENT)),
    PEAR_JUICE(18 ,new LivingPropertyChanger(25, V.E, V.C)),
    PEACH_JUICE(18 , new LivingPropertyChanger(18, V.H, V.C)),
    EGGPLANT_JUICE(24, new LivingPropertyChanger(12, V.H, V.C),
            new LivingPropertyChanger(-6, V.E, V.C)),
    LETTUCE_JUICE(12, new LivingPropertyChanger(12, V.H, V.C)),
    GARLIC_JUICE(18, new LivingPropertyChanger(3, V.H, V.M)),
    PEAS_JUICE(12, new LivingPropertyChanger(3, V.E, V.M)),
    POMEGRANATE_JUICE(30, new LivingPropertyChanger(18, V.H, V.C),
            new LivingPropertyChanger(18, V.H, V.C),
            new LivingPropertyChanger(6, V.E, V.M)),
    LEMON_JUICE(18, new LivingPropertyChanger(25, V.E, V.C)),
    CUCUMBERS_JUICE(12, new LivingPropertyChanger(12, V.E, V.C)),
    WATERMELON_JUICE(96, new LivingPropertyChanger(12, V.H, V.C),
            new LivingPropertyChanger(62, V.E, V.C),
            new LivingPropertyChanger(12, V.E, V.M)),
    TURNIP_JUICE(18, new LivingPropertyChanger(4, V.H, V.M),
            new LivingPropertyChanger(4, V.E, V.M)),
    ORANGE_JUICE(24, new LivingPropertyChanger(12, V.H, V.C),
            new LivingPropertyChanger(6, V.E, V.M)),
    APPLE_JUICE(24, new LivingPropertyChanger(12, V.E, V.C),
            new LivingPropertyChanger(6, V.H, V.M)),
    ONION_JUICE(18, new LivingPropertyChanger(6, V.H, V.M)),
    POTATO_JUICE(30, new LivingPropertyChanger(12, V.E, V.C),
            new LivingPropertyChanger(-6, V.H, V.C)),
    CARROT_JUICE(30, new LivingPropertyChanger(12, V.H, V.M)),
    TOMATO_JUICE(12, new LivingPropertyChanger(6, V.H, V.C),
            new LivingPropertyChanger(6, V.E, V.C)),
    MELON_JUICE(72, new LivingPropertyChanger(50, V.E, V.C),
            new LivingPropertyChanger(12, V.H, V.C),
            new LivingPropertyChanger(6, V.E, V.M)),
    PINEAPPLE_JUICE(180, new LivingPropertyChanger(18, V.H, V.C),
            new LivingPropertyChanger(18, V.E, V.C),
            new LivingPropertyChanger(18, V.E, V.M),
            new LivingPropertyChanger(18, V.H, V.M)),
    STRAWBERRY_JUICE(60, new LivingPropertyChanger(12, V.H, V.C),
            new LivingPropertyChanger(12, V.E, V.C),
            new LivingPropertyChanger(6, V.H, V.M),
            new LivingPropertyChanger(6, V.E, V.M)),
    PAPER_JUICE(30, new LivingPropertyChanger(12, V.E, V.C),
            new LivingPropertyChanger(6, V.H, V.M)),

    BREAD(20 , new LivingPropertyChanger(10 ,V.E ,V.C) ,
            new LivingPropertyChanger(5 , V.H ,V.C)),
    CHEESE(150 , new LivingPropertyChanger(30 , V.E ,V.C) ,
            new LivingPropertyChanger(30 , V.H , V.C))
    ;

    private final int money ;
    private final LivingPropertyChanger [] changers ;

    OtherEatable(int money, LivingPropertyChanger ...changers) {
        this.money = money;
        this.changers = changers;
    }


    @Override
    public int getPrice() {
        return money;
    }

    @Override
    public void getEaten(Live live) {

    }
    public String getName()
    {
        return name();
    }
    public String getStatus()
    {
        return "Can be used while cooking certain foods. “BE CAREFUL!!!”.";
    }
    public String getUse ()
    {
        return "You are eating" + " " + getName() + " " +  "\nALWAYS REMEMBER THE POOR";
    }

}
