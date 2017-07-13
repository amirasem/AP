package game.entities.type.instrument.farm;

import game.animals.properties.LivingPropertyType;
import game.animals.properties.values.LivingPropertyValueType;
import game.entities.type.api.LivingPropertyChanger;
import game.entities.type.eatable.V;
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
public enum Pick implements Tool {
    STONE(20,false,1,RockMetal.IRON, new Requirements(200,
            new PairOfEntityTypeValue(Wood.BRANCH, 5),
            new PairOfEntityTypeValue(RockMetal.STONE, 10)),
            new Requirements(20 , new PairOfEntityTypeValue(Wood.BRANCH ,2) ,
            new PairOfEntityTypeValue(RockMetal.STONE , 5)),
            new LivingPropertyChanger(150, V.E, V.C) ,
            new LivingPropertyChanger(150 , V.S , V.C)),

    IRON(15,false,2,RockMetal.SILVER, new Requirements(800,
            new PairOfEntityTypeValue(Wood.LOGS, 4),
            new PairOfEntityTypeValue(RockMetal.IRON, 8)),
            new Requirements(80 , new PairOfEntityTypeValue(Wood.LOGS , 2) ,
                    new PairOfEntityTypeValue(RockMetal.IRON , 4)),
            new LivingPropertyChanger(80, V.E, V.C) ,
            new LivingPropertyChanger(80 , V.S, V.C)),

    SILVER(10,false,3,RockMetal.ADAMANTIUM, new Requirements(2000,
            new PairOfEntityTypeValue(Wood.PINES, 3),
            new PairOfEntityTypeValue(RockMetal.SILVER, 6)),
            new Requirements(200 , new PairOfEntityTypeValue(Wood.PINES ,1) ,
                    new PairOfEntityTypeValue(RockMetal.SILVER ,3)),
            new LivingPropertyChanger(40, V.E, V.C) ,
            new LivingPropertyChanger(40 , V.S , V.C)),

    ADAMANTIUM(5,false,4,RockMetal.ALL, new Requirements(7000,
            new PairOfEntityTypeValue(Wood.OAKS, 2),
            new PairOfEntityTypeValue(RockMetal.ADAMANTIUM, 4)),
            new Requirements(700 , new PairOfEntityTypeValue(Wood.OAKS ,1) ,
                    new PairOfEntityTypeValue(RockMetal.ADAMANTIUM,2)),
            new LivingPropertyChanger(20, V.E, V.C) ,
            new LivingPropertyChanger(20 , V.S, V.C)),;

    private final LivingPropertyChanger[] changers;
    private final Requirements requirements;
    private RockMetal maxMetalCanOut;
    private final Requirements repairRequirements ;
    private final int level ;
    private boolean brokenStatus = false;
    private final int probabilityOfFailure;
   // private double alpha;

    Pick(int probabilityOfFailure ,  boolean brokenStatus ,int level,RockMetal maxMetalCanOut, Requirements requirements,Requirements repairRequirements ,LivingPropertyChanger... changers) {
        this.changers = changers;
        this.requirements = requirements;
        this.maxMetalCanOut = maxMetalCanOut;
        this.repairRequirements = repairRequirements ;
        this.level = level;
        this.brokenStatus = brokenStatus;
        this.probabilityOfFailure = probabilityOfFailure;
       // this.alpha = generateAlpha();
    }

    private double generateAlpha() {
        return (maxMetalCanOut.getCr() * (Math.pow(2 , (double) getLevel()))) /(Math.pow(2 , (double) maxMetalCanOut.getLevel()));
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
        return requirements.getMoney();
    }
    @Override
    public Tool getRequiredTool() {
        return null;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + super.toString();
    }
    public String getName()
    {
        return name();
    }
    public String getBrokenOrNot ()
    {
        changeBrokenStatus();
        if (this.brokenStatus)
            return "Broken";
        return "Not broken";
    }
    public void changeBrokenStatus ()
    {
        Random random = new Random();
        double accident  = random.nextDouble()*100;
        if(accident>=probabilityOfFailure){ brokenStatus =true;}
        brokenStatus =false;
    }
    public int getValue()
    {
        int energyNeeded = 0 ;
        for (LivingPropertyChanger l : changers)
            energyNeeded = l.getValue();
        return energyNeeded;
    }
//    int numberOfMatalCanCollect()
//    {
//        Random random = new Random();
//        return (int) (random.nextDouble() * alpha);
//
//    }
//    int getEnergyNeededForSpecialItem()
//    {
//        return (int) ((maxMetalCanOut.getEr() * (Math.pow(2 , maxMetalCanOut.getLevel())))/Math.pow(1.6 , getLevel()));
//    }
    public String getStatus()
    {
        return "A" + " " +getName()+" "+"pickaxe." +"\nEnergy required for each use:" + " " +
                getValue() + " " + "\n(" + getBrokenOrNot() + ")";
    }


}
