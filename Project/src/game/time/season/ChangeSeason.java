package game.time.season;

import game.time.Event;

/**
 * Created by Amir on 5/10/2017.
 * AHAY
 */
public class ChangeSeason extends Event {
    public ChangeSeason() {
        super(10 * 1000, new SeasonChangeHandler());
    }
}

