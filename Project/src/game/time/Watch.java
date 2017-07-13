package game.time;


import java.util.PriorityQueue;

/**
 * Created by Amir on 5/10/2017.
 * AHAY
 */
public class Watch extends Thread {
    private static Watch ourInstance = new Watch();

    public static Watch getInstance() {
        return ourInstance;
    }

    private final PriorityQueue<Event> queue;

    private Watch() {
        queue = new PriorityQueue<>(new EventComperator());
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            Event min = queue.remove();
            if (min.getFinish() < System.currentTimeMillis()) min.execute();
            else queue.add(min);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void add(Event event) {
        queue.add(event);
    }
}
