package game.entities.type.instrument.farm;

import game.animals.properties.LivingPropertyType;
import game.animals.properties.values.LivingPropertyValueType;
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
public enum Axe implements Tool {
    STONE(1 , false ,20, Wood.LOGS, new Requirements(200,
            new PairOfEntityTypeValue(Wood.BRANCH, 10),
            new PairOfEntityTypeValue(RockMetal.STONE, 5)),
            new Requirements(20 , new PairOfEntityTypeValue(Wood.BRANCH , 5 ),
                    new PairOfEntityTypeValue(RockMetal.STONE , 2)),
            new LivingPropertyChanger(150, LivingPropertyType.ENERGY, LivingPropertyValueType.CURRENT)),

    IRON(2 , false , 15,Wood.PINES, new Requirements(800,
            new PairOfEntityTypeValue(Wood.LOGS, 8),
            new PairOfEntityTypeValue(RockMetal.IRON, 4)),
            new Requirements(80 , new PairOfEntityTypeValue(Wood.LOGS , 4) ,
                    new PairOfEntityTypeValue(RockMetal.IRON,2 )),
            new LivingPropertyChanger(80, LivingPropertyType.ENERGY, LivingPropertyValueType.CURRENT)),

    SILVER(3, false , 10 , Wood.OAKS, new Requirements(2000,
            new PairOfEntityTypeValue(Wood.PINES, 6),
            new PairOfEntityTypeValue(RockMetal.SILVER, 3)),
            new Requirements(200 , new PairOfEntityTypeValue(Wood.PINES ,3) ,
                    new PairOfEntityTypeValue(RockMetal.SILVER , 1)),
            new LivingPropertyChanger(50, LivingPropertyType.ENERGY, LivingPropertyValueType.CURRENT)),

    ADAMANTIUM(4 ,false , 5 , Wood.ALL, new Requirements(2700,
            new PairOfEntityTypeValue(Wood.OAKS, 4),
            new PairOfEntityTypeValue(RockMetal.ADAMANTIUM, 2)),
            new Requirements(700 , new PairOfEntityTypeValue(Wood.OAKS  ,2) ,
                    new PairOfEntityTypeValue(RockMetal.ADAMANTIUM ,1)),
            new LivingPropertyChanger(20, LivingPropertyType.ENERGY, LivingPropertyValueType.CURRENT)),;

    private final LivingPropertyChanger[] changers;
    private final Requirements requirements;
    private final Requirements repairReqirments;
    private final int level;
    private boolean brokenStatus = false ;
    private final int probabilityOfFailure;
    private Wood maxWoodCanCut;
 //   private  double alpha;

    Axe(int level, boolean brokenStatus, int probabilityOfFailure, Wood maxWoodCanCut, Requirements requirements,Requirements repairReqirments ,LivingPropertyChanger... changers) {
        this.changers = changers;
        this.requirements = requirements;
        this.maxWoodCanCut = maxWoodCanCut;
        this.repairReqirments =repairReqirments;
        this.probabilityOfFailure = probabilityOfFailure;
        this.brokenStatus = brokenStatus;
        this.level = level;
        //this.alpha = generateAlpha();

    }

    @Override
    public Tool getRequiredTool() {
        return null;
    }

    @Override
    public Requirements getRequirements() {
        return requirements;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getPrice() {
        return getRequirements().getMoney()*3;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + super.toString();
    }
    public int getValue ()
    {
        int energyNeeded = 0 ;
        for (LivingPropertyChanger l : changers) energyNeeded = l.getValue();
        return energyNeeded;
    }
    public String getBrokenStatus()
    {
        changeBrokenStatus();
        if(this.brokenStatus) return "Broken";
        return "Not broken";
    }
    public void changeBrokenStatus()
    {
        Random random = new Random();
        double accident = random.nextDouble()*100;
        brokenStatus = (int) accident >= probabilityOfFailure;
    }
    public String getName ()
    {
        return name();
    }

//    double  generateAlpha()
//    {
//        return ((maxWoodCanCut.getCr() * Math.pow(2 ,  getLevel()))/(Math.pow(2,  maxWoodCanCut.getLevel())));
//    }
//    int numberOfWoodCanCollect()
//    {
//        Random random = new Random();
//        return (int) (random.nextDouble() * alpha);
//
//    }
//    int getEnergyNeededForSpecialItem()
//    {
//        return (int) ((maxWoodCanCut.getEr() * (Math.pow(2 , maxWoodCanCut.getLevel())))/Math.pow(1.6 , getLevel()));
//    }

    public String getStatus ()
    {
        return "A" + " " + getName() + " " + "axe." + "\nEnergy required for each use:" + " " + getValue() + " " +
                "\n(" + getBrokenStatus() + ")";
    }


}
