package game.entities.type.material.farm;
import com.sun.org.apache.regexp.internal.RE;
import game.entities.type.api.Material;
import game.entities.type.instrument.api.Tool;
import game.environment.Season;

/**
 * Created by AmirHosein on 5/22/2017.
 */
public enum  Seed {

    PEAR(Season.SPRING, 75 ,3),
    PEACH(Season.SPRING,75, 3),
    EGGPLANT(Season.SPRING,100 ,3),
    LETTUCE(Season.SPRING, 50 ,1),
    GARLIC(Season.SPRING, 75 ,1),
    PEAS(Season.SPRING, 50 ,3),
    POMEGRANATE(Season.SUMMER, 125, 3),
    LEMON(Season.SUMMER, 75 ,3 ),
    CUCUMBERS(Season.SUMMER, 50 ,3),
    WATERMELON(Season.SUMMER, 400 ,3 ),
    TURNIP(Season.SUMMER, 75,1),
    ORANGE(Season.FALL, 100,3),
    APPLE(Season.FALL, 100 ,3),
    ONION(Season.SUMMER, 75,1),
    POTATO(Season.FALL, 125,1),
    CARROT(Season.FALL, 125 ,1),
    TOMATO(Season.FALL, 50,3),
    MELON(Season.FALL, 300,3),
    PINEAPPLE(Season.GREENHOUSE, 750 ,3),
    STRAWBERRY(Season.GREENHOUSE, 250 ,3),
    PAPER(Season.GREENHOUSE, 125,3);


    private final int money ;
    private final Season season ;
    private final int harvestTime;

    Seed(Season season , int money , int harvestTime) {
        this.season = season ;
        this .money = money;
        this.harvestTime = harvestTime ;
    }
    public String getName(){
        return name();
    }

    public int getHarvestTime() {
        return harvestTime;
    }

    public Season getSeason() {
        return season;
    }

    public String getSeasonName()
    {
        Season season = getSeason() ;
        if(season.getName().equals("GREENHOUSE"))
            return "at the greenhouse";
        return  "in" +season.getName();
    }


    public String getStatus()
    {
        return "A" + " " + getName() + " "+ "seed. When it's fully raised , you can harvest it " +
                " " + getHarvestTime() + " "  +"times. Can only be raised (" + getSeasonName() + ")";
    }
}
