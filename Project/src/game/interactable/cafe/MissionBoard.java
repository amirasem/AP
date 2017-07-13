package game.interactable.cafe;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.cafe.MissionBoardUI;

/**
 * Created by Amir on 5/10/2017.
 * AHAY
 */
public class MissionBoard extends AbstractInteractable {
    private static MissionBoard ourInstance = new MissionBoard();

    public static MissionBoard getInstance() {
        return ourInstance;
    }

    public MissionBoard() {
    }

    @Override
    public UI getUI() {
        return new MissionBoardUI(this);
    }
}
