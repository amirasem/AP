package game.time;

import java.util.Comparator;

/**
 * Created by Amir on 5/10/2017.
 * AHAY
 */
public class EventComperator implements Comparator<Event> {
    @Override
    public int compare(Event o1, Event o2) {
        if (o1.getFinish() == o2.getFinish()) return 0;
        if (o1.getFinish() < o2.getFinish()) return -1;
        return 1;
    }
}
