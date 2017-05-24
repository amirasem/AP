package game.entities.type.material.farm;

import game.entities.type.api.Material;
import game.entities.type.instrument.api.Tool;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
abstract public class PlantSeed implements Material {
    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public Tool getRequiredTool() {
        return null;
    }
}
