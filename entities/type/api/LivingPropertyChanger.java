package game.entities.type.api;

import game.animals.properties.Live;
import game.animals.properties.LivingPropertyType;
import game.animals.properties.values.LivingPropertyValueType;

/**
 * Created by ahay on 4/19/17.
 * GIBILI GIBILI
 */
public class LivingPropertyChanger {
    private final int value;
    private final LivingPropertyType type;
    private final LivingPropertyValueType valueType;

    public LivingPropertyChanger(int value, LivingPropertyType type, LivingPropertyValueType valueType) {
        this.value = value;
        this.type = type;
        this.valueType = valueType;
    }

    public String getStatus() {
        return "This changes " + valueType + " of " + type + "  by " + value;
    }

    public int getValue ()
    {
        return value;
    }

    public void change(Live livingThing) {
        livingThing.change(type, valueType, value);
    }
}
