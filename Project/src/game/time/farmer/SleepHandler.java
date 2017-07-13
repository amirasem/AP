package game.time.farmer;

import game.mainchar.MainChar;
import game.time.TimeEventHandler;
import game.time.Watch;

import java.awt.event.WindowAdapter;

/**
 * Created by AmirHosein on 7/8/2017.
 * ASAY
 */
public class SleepHandler implements TimeEventHandler {
    @Override
    public void execute() {
        System.out.println("Farmer go to sleep");
        Watch.getInstance().add(new Sleep());
        Watch.getInstance().run();
        new WakeUp().execute();
    }
}
