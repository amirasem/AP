package game.time.farmer;

import game.mainchar.MainChar;
import game.time.TimeEventHandler;
import game.time.Watch;

/**
 * Created by AmirHosein on 7/8/2017.
 * ASAY
 */
public class WakeupHandler implements TimeEventHandler {
    @Override
    public void execute() {
        System.out.println("Farmer WakedUP!!!");
        Watch.getInstance().add(new WakeUp());
        Watch.getInstance().run();
    }
}
