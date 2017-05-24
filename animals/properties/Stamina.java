package game.animals.properties;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public class Stamina extends LivingProperty {
    Stamina(LivingPropertyType type, int current, int refillRate, int consumptionRate, int maximum) {
        super(type, current, refillRate, consumptionRate, maximum);
    }
}
