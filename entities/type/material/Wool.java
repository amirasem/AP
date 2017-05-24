package game.entities.type.material;

import game.entities.type.api.Material;
import game.entities.type.instrument.api.Tool;
import game.entities.type.instrument.farm.Machine;

/**
 * Created by AmirHosein on 5/22/2017.
 */
public enum Wool implements Material {
    WOOL(300)
    ;

    private final int money ;

    Wool(int money) {
        this.money = money;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public Tool getRequiredTool() {
        return null;
    }
    public String getStatus ()
    {
        return "Status: Sheep wool. By using a spinning wheel you can turn it into a thread.";
    }
}
