package game.time.farmer;

import game.time.Event;
import game.time.TimeEventHandler;

/**
 * Created by AmirHosein on 7/8/2017.
 * ASAY
 */
public class WakeUp extends Event {
    public WakeUp() {
        super(21*60*1000, new WakeupHandler());
    }
}
