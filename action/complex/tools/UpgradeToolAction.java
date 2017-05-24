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
public enum UpgradeToolAction implements Action {
    UPGRADE_SHOVEL_STONE,
    UPGRADE_SHOVEL_IRON,
    UPGRADE_SHOVEL_SILVER,
    UPGRADE_SHOVEL_ADAMANTIUM,
    UPGRADE_PICK_STONE,
    UPGRADE_PICK_IRON,
    UPGRADE_PICK_SILVER,
    UPGRADE_PICK_ADAMANTIUM,
    UPGRADE_AXE_STONE,
    UPGRADE_AXE_IRON,
    UPGRADE_AXE_SILVER,
    UPGRADE_AXE_ADAMANTIUM,
    UPGRADE_SPRINKLER_LITTLE,
    UPGRADE_SPRINKLER_LOG,
    UPGRADE_SPRINKLER_PINES,
    UPGRADE_SPRINKLER_OAK,
    UPGRADE_SPRINKLER_STONE,
    UPGRADE_SPRINKLER_IRON,
    UPGRADE_SPRINKLER_SILVER,
    UPGRADE_SPRINKLER_ADAMANTIUM,
    UPGRADE_COOK_PAN,
    UPGRADE_COOK_AGITATOR,
    UPGRADE_COOK_POT,
    UPGRADE_COOK_KNIFE,
    UPGRADE_COOK_OVEN,;
    private static final double UPGRADE_RATE = 0.3;
    private final Action[] actions;

    UpgradeToolAction() {
        Tool prevTool = NameHelperTool.getInstance().getTool(name());
        Tool nextTool = NameHelperTool.getInstance().getTool(name());
        this.actions = new Action[3];
        if (prevTool != null && nextTool != null) {
//            this.actions[0] = new TakeAction(prevTool, 1, Farmer.getInstance().getBackpack());
//            this.actions[1] = new PutAction(nextTool, 1, Farmer.getInstance().getBackpack());
            this.actions[2] = new TakeRequirementsAction(nextTool.getRequirements(), UPGRADE_RATE);
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
