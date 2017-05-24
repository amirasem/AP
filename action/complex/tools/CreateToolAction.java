package game.action.complex.tools;

import game.action.api.Action;
import game.action.complex.TakeRequirementsAction;
import game.action.simple.put.PutAction;
import game.entities.type.instrument.api.Tool;
import game.entities.type.living.Farmer;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public enum CreateToolAction implements Action {
    CREATE_SHOVEL_STONE,
    CREATE_SHOVEL_IRON,
    CREATE_SHOVEL_SILVER,
    CREATE_SHOVEL_ADAMANTIUM,
    CREATE_PICK_STONE,
    CREATE_PICK_IRON,
    CREATE_PICK_SILVER,
    CREATE_PICK_ADAMANTIUM,
    CREATE_AXE_STONE,
    CREATE_AXE_IRON,
    CREATE_AXE_SILVER,
    CREATE_AXE_ADAMANTIUM,
    CREATE_SPRINKLER_LITTLE,
    CREATE_SPRINKLER_LOG,
    CREATE_SPRINKLER_PINES,
    CREATE_SPRINKLER_OAK,
    CREATE_SPRINKLER_STONE,
    CREATE_SPRINKLER_IRON,
    CREATE_SPRINKLER_SILVER,
    CREATE_SPRINKLER_ADAMANTIUM,
    CREATE_COOK_PAN,
    CREATE_COOK_AGITATOR,
    CREATE_COOK_POT,
    CREATE_COOK_KNIFE,
    CREATE_COOK_OVEN,;
    private final Action[] actions;

    CreateToolAction() {
        Tool tool = NameHelperTool.getInstance().getTool(name());
        this.actions = new Action[2];
        if (tool != null) {
//            this.actions[0] = new PutAction(tool, 1, Farmer.getInstance().getBackpack());
            this.actions[1] = new TakeRequirementsAction(tool.getRequirements());
        }
    }

    @Override
    public boolean isActionValid() {
        for (Action a : actions) if (!a.isActionValid()) return false;
        return false;
    }


    @Override
    public String getName() {
        return name();
    }

    @Override
    public void happen() {
        for (Action a : actions) a.happen();
    }
}
