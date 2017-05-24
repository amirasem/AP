package game.action.complex.tools;

import game.action.api.Action;
import game.action.complex.TakeRequirementsAction;
import game.action.simple.put.PutAction;
import game.action.simple.take.TakeAction;
import game.entities.type.instrument.api.Tool;
import game.entities.type.living.Farmer;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public enum RepairToolAction implements Action {
    REPAIR_SHOVEL_STONE,
    REPAIR_SHOVEL_IRON,
    REPAIR_SHOVEL_SILVER,
    REPAIR_SHOVEL_ADAMANTIUM,
    REPAIR_PICK_STONE,
    REPAIR_PICK_IRON,
    REPAIR_PICK_SILVER,
    REPAIR_PICK_ADAMANTIUM,
    REPAIR_AXE_STONE,
    REPAIR_AXE_IRON,
    REPAIR_AXE_SILVER,
    REPAIR_AXE_ADAMANTIUM,
    REPAIR_SPRINKLER_LITTLE,
    REPAIR_SPRINKLER_LOG,
    REPAIR_SPRINKLER_PINES,
    REPAIR_SPRINKLER_OAK,
    REPAIR_SPRINKLER_STONE,
    REPAIR_SPRINKLER_IRON,
    REPAIR_SPRINKLER_SILVER,
    REPAIR_SPRINKLER_ADAMANTIUM,
    REPAIR_COOK_PAN,
    REPAIR_COOK_AGITATOR,
    REPAIR_COOK_POT,
    REPAIR_COOK_KNIFE,
    REPAIR_COOK_OVEN,;
    private static final double REPAIR_RATE = 0.5;
    private final Action[] actions;

    RepairToolAction() {
        Tool tool = NameHelperTool.getInstance().getTool(name());
        this.actions = new Action[3];
        if (tool != null) {
//            this.actions[0] = new TakeAction(tool, 1, Farmer.getInstance().getBackpack());
//            this.actions[1] = new PutAction(tool, 1, Farmer.getInstance().getBackpack());
            this.actions[2] = new TakeRequirementsAction(tool.getRequirements(), REPAIR_RATE);
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
