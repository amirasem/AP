package game.animals.properties.values;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public class LivingPropertyValue {
    private final LivingPropertyValueType type;
    private int value;

    public LivingPropertyValue(LivingPropertyValueType type, int value) {
        this.type = type;
        this.value = value;
    }

    public LivingPropertyValueType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public void addValue(int value) {
        this.value += value;
    }
}
