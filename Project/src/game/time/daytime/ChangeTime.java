package game.time.daytime;

import game.time.Event;
import game.time.TimeEventHandler;

/**
 * Created by AmirHosein on 7/8/2017.
 * ASAY
 */
public class ChangeTime extends Event {
    public ChangeTime() {
        super(3*60*1000 ,  new DayTimeChangeHandler());
    }
}
