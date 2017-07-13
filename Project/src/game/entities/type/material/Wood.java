package game.entities.type.material;

import game.entities.type.api.Material;
import game.entities.type.instrument.api.Tool;
import game.entities.type.instrument.farm.Axe;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public enum Wood  implements Material {
    BRANCH(null, 1, 20 , null),
    LOGS(Axe.STONE, 2, 80 , "Normal"),
    PINES(Axe.IRON, 3, 250 , "Strong"),
    OAKS(Axe.SILVER, 4, 1000 , "Very strong"),
    ALL(Axe.ADAMANTIUM, 5);
    private  Tool requiredTool;


    private String name;
    private  int level;
    private int price ;
    private static final double CR  = 2.5 ;
    private static final int ER = 30;
    private String hardness ;
    Wood(Tool requiredTool, int level , int price ,String hardness) {
        this.requiredTool = requiredTool;
        this.level = level;
        this.price = price;
        this.hardness = hardness;
    }
    Wood(Tool requiredTool, int level)
    {
        this.requiredTool= requiredTool;
        this.level = level;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public Tool getRequiredTool() {
        return requiredTool;
    }
    public String getName()
    {
        return name();
    }
    public double getCr ()
    {
        return CR;
    }
    public int getEr()
    {
        return ER;
    }
    public String getHardness()
    {
        return hardness;
    }
    public String getBranchStatus(){
        return "Status: Weak tree branch. Can be used to create specific items at the workshop.";
    }
    public String getStatus(){
        return "(" + getHardness() +")" + "wood gotten from " + " " + getName() +
                " " + "tree. Can be used to create specific items at the workshop";
    }

}
