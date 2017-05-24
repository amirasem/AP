package game.entities.type.instrument.farm;

import game.animals.properties.LivingPropertyType;
import game.animals.properties.values.LivingPropertyValueType;
import game.entities.type.api.LivingPropertyChanger;
import game.entities.type.instrument.api.Tool;
import game.entities.type.material.ThreadFishing;
import game.entities.type.material.Wood;
import game.entities.type.requirement.PairOfEntityTypeValue;
import game.entities.type.requirement.Requirements;
import game.entities.type.storage.Wallet;

import java.util.Random;

/**
 * Created by AmirHosein on 5/21/2017.
 */
public enum FishingRod implements Tool {
    LITTLE(20,new Requirements(100 , new PairOfEntityTypeValue(Wood.BRANCH , 15 ) ,
            new PairOfEntityTypeValue(ThreadFishing.Thread , 1)),
            new Requirements(10 , new PairOfEntityTypeValue(Wood.BRANCH ,5 ) ,
                    new PairOfEntityTypeValue(ThreadFishing.Thread , 1)) ,1 ,40 ,
            new LivingPropertyChanger(150 , LivingPropertyType.ENERGY , LivingPropertyValueType.CURRENT)),

    LOG(15 , new Requirements(300,new PairOfEntityTypeValue(Wood.LOGS ,10) ,
            new PairOfEntityTypeValue(ThreadFishing.Thread , 3)) ,
            new Requirements(30,new PairOfEntityTypeValue(ThreadFishing.Thread ,2 ) ,
                    new PairOfEntityTypeValue(Wood.LOGS ,4 )) ,2 , 60 ,
            new LivingPropertyChanger(80 , LivingPropertyType.ENERGY,LivingPropertyValueType.CURRENT)) ,

    PINES (10 , new Requirements(800 , new PairOfEntityTypeValue(Wood.PINES ,6 ) ,
            new PairOfEntityTypeValue(ThreadFishing.Thread , 4)) ,
            new Requirements(80 , new PairOfEntityTypeValue(Wood.PINES , 3) ,
                    new PairOfEntityTypeValue(ThreadFishing.Thread , 1)),3 , 80,
            new LivingPropertyChanger(50 , LivingPropertyType.ENERGY, LivingPropertyValueType.CURRENT)) ,

    OAK (5, new Requirements(2000 ,new PairOfEntityTypeValue(Wood.OAKS , 3 ) ,
            new PairOfEntityTypeValue(ThreadFishing.Thread , 5)) ,
            new Requirements(200 , new PairOfEntityTypeValue(Wood.OAKS ,2) ,
                    new PairOfEntityTypeValue(ThreadFishing.Thread ,1)), 4 ,100 ,
            new LivingPropertyChanger(20 , LivingPropertyType.ENERGY,LivingPropertyValueType.CURRENT));

    private final LivingPropertyChanger[] changers;
    private final Requirements requirements;
    private final Requirements repairReqirments;
    private final int level;
    private boolean brokenStatus = false ;
    private final int probabilityOfSuccess;
    private final int probabilityOfFailure ;
    FishingRod(int probabilityOfFailure ,Requirements requirements, Requirements repairReqirments, int level, int probabilityOfSuccess, LivingPropertyChanger... changers) {
        this.changers = changers;
        this.requirements = requirements;
        this.repairReqirments = repairReqirments;
        this.level = level;
        this.probabilityOfSuccess = probabilityOfSuccess;
        this.probabilityOfFailure = probabilityOfFailure;
    }

    @Override
    public int getPrice() {
        return requirements.getMoney() * 2;
    }
    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public Tool getRequiredTool() {
        return null;
    }

    @Override
    public Requirements getRequirements() {
        return requirements ;
    }

    public String getName()
    {
        return name();
    }
    public int getValue()
    {
        int energyNeeded = 0;
        for (LivingPropertyChanger l : changers) energyNeeded = l.getValue();
        return  energyNeeded;
    }
    public String getBrokenOrNot()
    {
        changeBrokenStatus();
        if(this.brokenStatus) return "Broken";
        return "Not broken";
    }
    public void changeBrokenStatus()
    {
        Random random = new Random();
        double accident = random.nextDouble()*100;
        if(accident>=probabilityOfFailure) brokenStatus =true;
        brokenStatus = false ;
    }

    public int getProbabilityOfSuccess() {
        return probabilityOfSuccess;
    }

    public String getStatus()
    {
        return "A" + " " + getName() + " " +"fishing rod." + "There is" + " " + getProbabilityOfSuccess() + " " +
                "chance to successfully catch a fish every try." + "\n\nIt will cost " + " "  + getValue() + " " +" Energy Point after every use " +
            "\n\n(" + getBrokenOrNot() + ")";
    }

    public static void main(String[] args) {
        String out  = FishingRod.LITTLE.getStatus();
        System.out.println(out);
    }

}
