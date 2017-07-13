package game.time.farmer;

import game.time.Event;
import game.time.TimeEventHandler;

/**
 * Created by AmirHosein on 7/8/2017.
 * ASAY
 */
public class Sleep extends Event {
    public Sleep() {
        super(15*60*1000,new SleepHandler());
    }
}
