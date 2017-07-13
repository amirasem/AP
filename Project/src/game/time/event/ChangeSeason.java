package game.time.event;

import game.time.Event;
import game.time.TimeEventHandler;
import game.time.Watch;

/**
 * Created by Amir on 5/10/2017.
 * AHAY
 */
public class ChangeSeason extends Event {
    public ChangeSeason() {
        super(10 * 1000, new SeasonChangeHandler());
    }
}

class SeasonChangeHandler implements TimeEventHandler {

    @Override
    public void execute() {
        System.out.println("Season changed");
        //TODO:
        Watch.getInstance().add(new ChangeSeason());
    }
}
