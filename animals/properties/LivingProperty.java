package game.animals.properties;

import com.sun.istack.internal.NotNull;
import game.animals.properties.values.LivingPropertyValue;
import game.animals.properties.values.LivingPropertyValueType;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public abstract class LivingProperty {
    private final LivingPropertyType type;
    private final LivingPropertyValue maximum;
    private final LivingPropertyValue current;
    private final LivingPropertyValue refillRate;
    private final LivingPropertyValue consumptionRate;
    private final LivingPropertyValue[] values;

    LivingProperty(LivingPropertyType type, int current, int refillRate, int consumptionRate, int maximum) {
        this.type = type;
        this.maximum = new LivingPropertyValue(LivingPropertyValueType.MAXIMUM, maximum);
        this.current = new LivingPropertyValue(LivingPropertyValueType.CURRENT, current);
        this.refillRate = new LivingPropertyValue(LivingPropertyValueType.REFILL_RATE, refillRate);
        this.consumptionRate = new LivingPropertyValue(LivingPropertyValueType.CONSUMPTION_RATE, consumptionRate);
        values = new LivingPropertyValue[]{this.maximum, this.current, this.refillRate, this.consumptionRate};
    }

    public void addToProperty(LivingPropertyValueType type, int value) {
        getValueOfType(type).addValue(value);
    }

    public int getValueOf(LivingPropertyValueType type) {
        return getValueOfType(type).getValue();
    }

    @NotNull
    private LivingPropertyValue getValueOfType(LivingPropertyValueType type) {
        for (LivingPropertyValue v : values) if (v.getType() == type) return v;
        return null;
    }
}