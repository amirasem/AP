package game.time;

/**
 * Created by Amir on 5/10/2017.
 * AHAY
 */
public class Event {
    private final long length;
    private final long start;
    private TimeEventHandler handler;

    public Event(long length, TimeEventHandler handler) {
        this.length = length;
        this.handler = handler;
        start = System.currentTimeMillis();
    }

    public void execute() {
        if (handler != null) handler.execute();
    }

    long getLength() {
        return length;
    }

    public long getFinish() {
        return start + length;
    }
}
