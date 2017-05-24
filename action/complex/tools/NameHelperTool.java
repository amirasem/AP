package game.action.complex.tools;

import game.entities.type.instrument.api.Tool;
import game.entities.type.instrument.cook.CookTool;
import game.entities.type.instrument.farm.Axe;
import game.entities.type.instrument.farm.Pick;
import game.entities.type.instrument.farm.Shovel;
import game.entities.type.instrument.farm.Sprinkler;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public class NameHelperTool {
    private static NameHelperTool ourInstance = new NameHelperTool();

    public static NameHelperTool getInstance() {
        return ourInstance;
    }

    private NameHelperTool() {
    }

    Tool getTool(String name) {
        String[] parts = name.split("_");
        switch (parts[1]) {
            case "AXE":
                return Axe.valueOf(parts[2]);
            case "SPRINKLER":
                return Sprinkler.valueOf(parts[2]);
            case "PICK":
                return Pick.valueOf(parts[2]);
            case "SHOVEL":
                return Shovel.valueOf(parts[2]);
            case "COOK":
                return CookTool.valueOf(parts[2]);
        }
        return null;
    }

    Tool getNext(String name) {
        String[] parts = name.split("_");
        try {
            switch (parts[1]) {
                case "AXE":
                    return Axe.values()[Axe.valueOf(parts[2]).ordinal() + 1];
                case "SPRINKLER":
                    return Sprinkler.values()[Sprinkler.valueOf(parts[2]).ordinal() + 1];
                case "PICK":
                    return Pick.values()[Pick.valueOf(parts[2]).ordinal() + 1];
                case "SHOVEL":
                    return Shovel.values()[Shovel.valueOf(parts[2]).ordinal() + 1];
                case "COOK":
                    return CookTool.values()[CookTool.valueOf(parts[2]).ordinal() + 1];
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}
