package game.entities.type.instrument.cook;

import game.entities.type.api.LivingPropertyChanger;
import game.entities.type.instrument.api.Tool;
import game.entities.type.material.RockMetal;
import game.entities.type.material.Wood;
import game.entities.type.requirement.PairOfEntityTypeValue;
import game.entities.type.requirement.Requirements;

import java.util.Random;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public enum CookTool implements Tool {
    PAN(false, 10, new Requirements(100, new PairOfEntityTypeValue(RockMetal.IRON, 7))),
    AGITATOR(false, 10, new Requirements(300,
            new PairOfEntityTypeValue(RockMetal.SILVER, 5),
            new PairOfEntityTypeValue(Wood.PINES, 3))),
    POT(false, 20, new Requirements(900, new PairOfEntityTypeValue(RockMetal.STONE, 10))),
    KNIFE(false, 20, new Requirements(2700, new PairOfEntityTypeValue(RockMetal.IRON, 3),
            new PairOfEntityTypeValue(Wood.LOGS, 2))),
    OVEN(false, 5, new Requirements(81000, new PairOfEntityTypeValue(RockMetal.ADAMANTIUM, 3),
            new PairOfEntityTypeValue(Wood.OAKS, 3)));

    private final LivingPropertyChanger[] changers;
    private final Requirements requirements;
    private final int probabilityOfFailure;
    private boolean brokenStatus   = false;

    CookTool(boolean brokenStatus, int probabilityOfFailure, Requirements requirements, LivingPropertyChanger... changers) {
        this.probabilityOfFailure = probabilityOfFailure;
        this.changers = changers;
        this.requirements = requirements;
        this.brokenStatus = brokenStatus;
    }


    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public Requirements getRequirements() {
        return requirements;
    }

    @Override
    public Tool getRequiredTool() {
        return null;
    }

    @Override
    public int getPrice() {
        return requirements.getMoney() * 2;
    }

    public void changeBrokenStatus() {
        Random random = new Random();
        double accident = random.nextDouble() * 100;
        brokenStatus = (int) accident >= probabilityOfFailure;
    }

    public String getbrokenOrNot() {
        changeBrokenStatus();
        if (this.brokenStatus) return "Broken";
        return "Not broken";
    }

    public String getName() {
        return name();
    }
    public String getStatus (){
        return "A" + " " + getName() +"." + "(" +getbrokenOrNot()+")";
    }

}
