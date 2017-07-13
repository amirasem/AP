package game.entities.type.material;

import game.entities.type.api.Material;
import game.entities.type.instrument.api.Tool;
import game.entities.type.instrument.farm.Pick;
import ui.UI;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public enum  RockMetal  implements Material {

    STONE(null, 1 , 20 , null),
    IRON(Pick.STONE, 2, 80 , "Normal"),
    SILVER(Pick.IRON, 3 , 250  ,"Strong" ),
    ADAMANTIUM(Pick.SILVER, 4, 1000 , "Very strong"),
    ALL(Pick.ADAMANTIUM, 4),;
    //DIAMOND(Pick.ADAMANTIUM, 5, 15000);
    private static final double CR = 2.5 ;
    private static final int ER = 30;
    private String hardness;
    private  Tool requiredTool;
    private  int level;
    private int price ;
    RockMetal(Tool requiredTool, int level) {
        this.requiredTool = requiredTool;
        this.level = level;
    }
    RockMetal( Tool requiredTool, int level, int price , String hardness) {
        this.requiredTool = requiredTool;
        this.level = level;
        this.price = price;
        this.hardness = hardness;
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

    public String getName  ()
    {
        return name();
    }

    public  UI getUI (){
        return null;
    }
    public double getCr(){
        return CR;
    }
    public int getEr()
    {
        return ER;
    }
    public String getHardness(){
        return hardness;
    }
    public String getStoneStatus()
    {
        return "Status: Bunch of stones collected from the ground. Can be used to create specific items at the workshop.";
    }
    public String getStatus()
    {
        return "A" + "(" + getHardness() +")" + "type of metal . Can be used to create specific items at the workshop";
    }
}
