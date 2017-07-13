package game.time.season;

import game.time.TimeEventHandler;
import game.time.Watch;
import game.time.season.ChangeSeason;

public class SeasonChangeHandler implements TimeEventHandler {

   @Override
   public void execute() {
       System.out.println("Season changed");
       //TODO:
       Watch.getInstance().add(new ChangeSeason());
       Watch.getInstance().run();
   }
}
