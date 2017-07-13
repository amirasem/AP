package game.time.daytime;

import game.time.TimeEventHandler;
import game.time.Watch;
import game.time.season.ChangeSeason;

/**
 * Created by AmirHosein on 7/8/2017.
 * ASAY
 */
public class DayTimeChangeHandler implements TimeEventHandler {
    @Override
    public void execute() {
        System.out.println("1 hour pass");
       Watch.getInstance().add(new ChangeTime());
        Watch.getInstance().run();
//        new ChangeSeason().execute();
    }

}
