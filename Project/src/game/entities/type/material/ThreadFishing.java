package game.entities.type.material;

import game.entities.type.api.Material;
import game.entities.type.instrument.api.Tool;
import game.entities.type.instrument.farm.Machine;

/**
 * Created by AmirHosein on 5/22/2017.
 */
public enum ThreadFishing implements Material {
    Thread(Machine.SPINNING_WHEEL, 1, 200);


    private final Machine machine;
    private Tool requiredTool;

    private int level;
    private int price;

    ThreadFishing(Machine machine, int level, int price) {
        this.machine = machine ;
        this.level = level;
        this.price = price;
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

    public Machine geMachine(){
        return this.machine;
    }
    public String getName() {
        return this.name();
    }
    public String getStatus(){
        return "Status: Can be used to create specific items at the workshop.";
    }
}
