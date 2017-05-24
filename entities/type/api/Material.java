package game.entities.type.api;

import game.entities.type.instrument.api.Tool;

/**
 * Created by ahay on 4/19/17.
 * GIBILI GIBILI
 */
public interface Material extends EntityType {
    int getLevel();
    Tool getRequiredTool();
}
