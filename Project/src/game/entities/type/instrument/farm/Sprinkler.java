package game.entities.type.instrument.farm;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.stream.events.NamedEvent;
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
public enum Sprinkler implements Tool {

    LITTLE( 0 , 20 , false, 1 , 1, 1, new Requirements(50, new PairOfEntityTypeValue(Wood.BRANCH, 5)),
            new Requirements(50 , new PairOfEntityTypeValue(Wood.BRANCH ,2)),
            new LivingPropertyChanger(40, V.E, V.C) ,
            new LivingPropertyChanger(40 , V.S, V.C)),

    LOG(1,15,false,2 , 2, 2, new Requirements(200, new PairOfEntityTypeValue(Wood.LOGS, 4)),
            new Requirements(20 , new PairOfEntityTypeValue(Wood.LOGS ,2)),
            new LivingPropertyChanger(30, V.E, V.C) ,
            new LivingPropertyChanger(30 , V.S, V.C)),

    PINES(3,10,false ,3,3, 4, new Requirements(500, new PairOfEntityTypeValue(Wood.PINES, 3)),
            new Requirements(50 , new PairOfEntityTypeValue(Wood.PINES ,1)),
            new LivingPropertyChanger(20, V.E, V.C) ,
            new LivingPropertyChanger(20 , V.S ,V.C)),


    OAK(8,5,false,4,9, 8, new Requirements(2000, new PairOfEntityTypeValue(Wood.OAKS, 2)),
            new Requirements(200 , new PairOfEntityTypeValue(Wood.OAKS,1)),
            new LivingPropertyChanger(10, V.E, V.C) ,
            new LivingPropertyChanger(10 , V.S ,V.C)),

    STONE(0,20,false,1,1, 2, new Requirements(50,
            new PairOfEntityTypeValue(RockMetal.STONE, 5)),
            new Requirements(5 , new PairOfEntityTypeValue(RockMetal.STONE,2)),
            new LivingPropertyChanger(80, V.E, V.C) ,
            new LivingPropertyChanger(80 , V.S , V.C)),

    IRON(2,15,false,2,2, 4, new Requirements(200,
            new PairOfEntityTypeValue(RockMetal.IRON, 4)),
            new Requirements(20 , new PairOfEntityTypeValue(RockMetal.IRON , 2)),
            new LivingPropertyChanger(60, V.E, V.C) ,
            new LivingPropertyChanger(60 , V.S , V.C)),

    SILVER(5,10,false,3,3, 8, new Requirements(500,
            new PairOfEntityTypeValue(RockMetal.SILVER, 3)),
            new Requirements(50 , new PairOfEntityTypeValue(RockMetal.SILVER , 1)),
            new LivingPropertyChanger(40, V.E, V.C) ,
            new LivingPropertyChanger(40 , V.S , V.C)),

    ADAMANTIUM(16,5,false,4,9, 16, new Requirements(2000,
            new PairOfEntityTypeValue(RockMetal.ADAMANTIUM, 2)),
            new Requirements(200 , new PairOfEntityTypeValue(RockMetal.ADAMANTIUM ,1)),
            new LivingPropertyChanger(20, V.E, V.C) ,
            new LivingPropertyChanger(20 , V.S , V.C)),;

    private int surfaceToWork; //range
    private final LivingPropertyChanger[] changers;
    private final Requirements requirements;
    private final Requirements repairRequirments ;
    private final int level ;
    private final int probabilityOfFailure ;
    private boolean btokenStatus;
    private int numberOfPartsCanWork; //capacity to water “num” fields
    private final int waterLevel; //num

    Sprinkler(int waterLevel , int probabilityOfFailure , boolean btokenStatus , int level, int surfaceToWork, int numberOfPartsCanWork, Requirements requirements,Requirements repairRequirments, LivingPropertyChanger... changers) {
        this.surfaceToWork = surfaceToWork;
        this.changers = changers;
        this.requirements = requirements;
        this.numberOfPartsCanWork = numberOfPartsCanWork;
        this.repairRequirments = repairRequirments ;
        this.probabilityOfFailure = probabilityOfFailure ;
        this.btokenStatus = btokenStatus ;
        this.level = level;
        this.waterLevel = waterLevel;

    }

    @Override
    public Tool getRequiredTool() {
        return null;
    }

    @Override
    public int getPrice() {
        return requirements.getMoney() * 2;
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
    public String toString() {
        return getClass().getSimpleName() + " " + super.toString();
    }

    public String getName()
    {
        return name();
    }
    public int getSurfaceToWork()
    {
        return surfaceToWork;
    }

    public int getNumberOfPartsCanWork() {
        return numberOfPartsCanWork;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void changeBrokenStatus()
    {
        Random random = new Random() ;
        double accident = random.nextDouble() *100 ;
        if((int)accident >=probabilityOfFailure) btokenStatus =true;
        btokenStatus = false;
    }
    public int getValue()
    {
        int energyNeeded = 0 ;
        for (LivingPropertyChanger l : changers)
            energyNeeded = l.getValue();
        return energyNeeded;
    }
    public String getBrokenOrNot ()
    {
        changeBrokenStatus();
        if(this.btokenStatus) return "Broken";
        return "Not broken";
    }

    public String getStatus()
    {
        return "A" + " " + getName() + " " +"sprinkler. " + "With this sprinkler you can water a" +" " + getSurfaceToWork() +" " +
                "\nrange in one go. It has capacity to water " + " " + getNumberOfPartsCanWork() + " " +"field of the \nfarm" +
                "\nWater level:" +" " + getWaterLevel() +" " + "of" + " " + getNumberOfPartsCanWork() +" " +
                "\nEnergy required for each use:" + getValue() + " "  + "\n(" + getBrokenOrNot() + ")" ;
    }

}
