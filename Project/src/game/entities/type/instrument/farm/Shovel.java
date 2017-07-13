package game.entities.type.instrument.farm;

import com.sun.corba.se.impl.presentation.rmi.DynamicMethodMarshallerImpl;
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
public enum Shovel implements Tool {
    STONE(20,false, 1,1, new Requirements(100,
            new PairOfEntityTypeValue(Wood.BRANCH, 5),
            new PairOfEntityTypeValue(RockMetal.STONE, 5)),
            new Requirements(10 , new PairOfEntityTypeValue(Wood.BRANCH  , 2),
            new PairOfEntityTypeValue(RockMetal.STONE ,2)),
            new LivingPropertyChanger(150, V.E, V.C) ,
            new LivingPropertyChanger(150 , V.S , V.C)),

    IRON(15,false ,2,2, new Requirements(500,
            new PairOfEntityTypeValue(Wood.LOGS, 4),
            new PairOfEntityTypeValue(RockMetal.IRON, 4)),
            new Requirements(50 , new PairOfEntityTypeValue(Wood.LOGS ,4 ) ,
            new PairOfEntityTypeValue(RockMetal.IRON ,2)),
            new LivingPropertyChanger(80, V.E, V.C),
            new LivingPropertyChanger(80 , V.S , V.C)),

    SILVER(10,false , 3,3, new Requirements( 1000,
            new PairOfEntityTypeValue(Wood.PINES, 3),
            new PairOfEntityTypeValue(RockMetal.SILVER, 3)),
            new Requirements(50 , new PairOfEntityTypeValue(Wood.PINES , 1) ,
            new PairOfEntityTypeValue(RockMetal.SILVER ,1)),
            new LivingPropertyChanger(40, V.E, V.C) ,
            new LivingPropertyChanger(40 , V.S , V.C)),

    ADAMANTIUM( 5,true, 4,9, new Requirements(4000,
            new PairOfEntityTypeValue(Wood.OAKS, 2),
            new PairOfEntityTypeValue(RockMetal.ADAMANTIUM, 2)),
            new Requirements(400 , new PairOfEntityTypeValue(Wood.OAKS ,1) ,
            new PairOfEntityTypeValue(RockMetal.ADAMANTIUM ,1)),
            new LivingPropertyChanger(20, V.E, V.C) ,
            new LivingPropertyChanger(20 , V.S , V.C));

    private int surfaceToWork;
    private final LivingPropertyChanger[] changers;
    private final Requirements requirements;
    private final Requirements rpairRequirements ;
    private final int level  ;
    private Boolean brokenStatus = false;
    private final int probabilityOfFailure;
    Shovel(int probabilityOfFailure ,boolean brokenStatus ,int level , int surfaceToWork, Requirements requirements,Requirements rpairRequirements, LivingPropertyChanger... changers) {
        this.surfaceToWork = surfaceToWork;
        this.changers = changers;
        this.requirements = requirements;
        this.rpairRequirements = rpairRequirements ;
        this.level = level ;
        this.brokenStatus = brokenStatus;
        this.probabilityOfFailure = probabilityOfFailure;
    }



    double generateBetweenZeroAndAlpha(double alpha){
        Random random = new Random();
        return random.nextDouble() * alpha ;
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
        return this.level;
    }

    @Override
    public int getPrice() {
        return getRequirements().getMoney() * 2;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + super.toString();
    }
    public String getName()
    {
        return this.name();
    }
    public int getSurfaceToWork(){
        return surfaceToWork;
    }
    public int getValue ()
    {
        int m = 0 ;
        for (LivingPropertyChanger l : changers)
        {
            m = l.getValue();
        }
        return m;
    }
    public String getBrokenOrNot()
    {
        changeBrokenStatus();
        if(this.brokenStatus)
        {
            return "Broken";
        }
        return "Not broken";
    }
    public void changeBrokenStatus()
    {
        Random random = new Random();
        double accident = random.nextDouble() * 100;
        if((int)accident>=probabilityOfFailure) {
            brokenStatus = true;
        }
        else {
            brokenStatus = false;
        }
    }
    public String getStatus()
    {
        return "A"  +" " +getName() + " " + "shovel. With this shovel you can dig a " + getSurfaceToWork() + " " + "range in on go."
                +"\nEnergy required for each use:" + " " + getValue() + " " + "\n(" + getBrokenOrNot() + ")";
    }
}
