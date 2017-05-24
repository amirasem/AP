package game.action.complex.material;

import game.action.api.Action;
import game.action.simple.put.PutAction;
import game.action.simple.take.TakeAction;
import game.entities.type.api.Material;
import game.entities.type.living.Farmer;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public enum ExtractAction implements Action {
    EXTRACT_ROCK_STONE,
    EXTRACT_ROCK_DIAMOND,
    EXTRACT_ROCK_IRON,
    EXTRACT_ROCK_SILVER,
    EXTRACT_ROCK_ADAMANTIUM,
    EXTRACT_WOOD_BRANCH,
    EXTRACT_WOOD_LOGS,
    EXTRACT_WOOD_PINES,
    EXTRACT_WOOD_OAKS,
    EXTRACT_WOOD_ALL;


    private final Action[] actions;

    ExtractAction() {
       Material material = MaterialNameHelper.getInstance().getMaterial(name());
        this.actions = new Action[3];
        if (material != null) {
//            this.actions[0] = new PutAction(material, 1, Farmer.getInstance().getBackpack());
//            this.actions[1] = new TakeAction(material.getRequiredTool(), 1, Farmer.getInstance().getBackpack());
//            this.actions[2] = new PutAction(material.getRequiredTool(), 1, Farmer.getInstance().getBackpack());
        }
    }

    @Override
    public boolean isActionValid() {
        for (Action a : actions) if (!a.isActionValid()) return false;
        return false;
    }

    @Override
    public void happen() {
        for (Action a : actions) a.happen();
    }


    @Override
    public String getName() {
        return name();
    }
}