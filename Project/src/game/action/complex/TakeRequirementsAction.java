package game.action.complex;

import game.action.api.Action;
import game.action.simple.take.TakeAction;
import game.action.simple.take.TakeMoneyAction;
import game.entities.type.requirement.PairOfEntityValue;
import game.entities.type.requirement.Requirements;
import game.entities.type.living.Farmer;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class TakeRequirementsAction extends ComplexAction {
    private static final double EPS = 0.000001;

    private static Action[] generateActions(Requirements requirements) {
        return generateActions(requirements, 1.0);
    }

    private static Action[] generateActions(Requirements requirements, double rate) {
        Action[] actions = new Action[requirements.getRequirements().length + 1];
        for (int i = 0; i < actions.length - 1; i++) {
//            PairOfEntityValue p = requirements.getRequirements()[i];
//            actions[i] = new TakeAction(p.getEntityType(), (int) (p.getValue() * rate + EPS),
//                    Farmer.getInstance().getBackpack());
        }
        actions[actions.length - 1] = new TakeMoneyAction((int) (requirements.getMoney() * rate + EPS));
        return actions;
    }

    public TakeRequirementsAction(Requirements requirements) {
        super(generateActions(requirements));
    }


    public TakeRequirementsAction(Requirements requirements, double rate) {
        super(generateActions(requirements, rate));
    }
}
