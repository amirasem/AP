package game.action.simple.workshop;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.workshop.DisassembleUI;

/**
 * Created by Amir on 5/11/2017.
 * AHAY
 */
public class Disassemble extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new DisassembleUI(this);
    }
    //TODO : bayad bad az entekhab in ghozine list chiz haye dakhele kole poshti
    //ya faghat abzar ha ro neshon bede va krbar be tone entekhab kone
}
