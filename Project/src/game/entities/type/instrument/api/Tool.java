package game.entities.type.instrument.api;

import game.entities.type.api.Material;
import game.entities.type.requirement.Requirements;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public interface Tool extends Material {
    Requirements getRequirements();
}
