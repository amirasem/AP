package game.entities.type.requirement;

/**
 * Created by ahay on 4/19/17.
 * GIBILI GIBILI
 */
public class Requirements {
    private final PairOfEntityTypeValue[] requirements;
    private final int money;

    public Requirements(int money, PairOfEntityTypeValue... requirements) {
        this.money = money;
        this.requirements = requirements;
    }

    public PairOfEntityTypeValue[] getRequirements() {
        return requirements;
    }

    public int getMoney() {
        return money;
    }
}