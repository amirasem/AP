package game.action.simple.store.clinic;

import game.action.complex.buy.Buy;
import game.action.simple.picker.GoodsAndPrices;
import game.action.simple.picker.StorePicker;
import game.action.simple.store.HealUP;
import game.entities.Eatable;
import game.entities.type.api.EntityType;
import game.entities.type.eatable.api.EatableEntityType;
import ui.command.CommandLineHelper;

/**
 * Created by AmirHosein on 7/5/2017.
 * ASAY
 */
public class ClinicHealUp extends HealUP {
    //todo : bayad ye class i bashe ke bejaye buy kardan bere to Physical property ha va Health ro max kone
    public ClinicHealUp()
    {
        super(ClinicHelper.getListForHealUp());
    }
    @Override
    public void happen() {
        GoodsAndPrices goodsAndPrices = new StorePicker("Heal up ", getListOfItemsFromEntities(list)).choose();
      EntityType entity = goodsAndPrices.getType();
       System.out.println("You will Heal up for 500 Gil . Is that okay?");
        int x = CommandLineHelper.getInstance().nextInt();
        Buy buy = new Buy(new Eatable((EatableEntityType) entity), goodsAndPrices.getMoney(), x);
        if (buy.isActionValid()) {
            System.out.println("You will Heal up for 500 Gil . Is that okay?");
            if (CommandLineHelper.getInstance().next().equals("Y")) {
                buy.happen();
            }
        }

    }
    }

