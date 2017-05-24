package game.action.api;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public interface ActionHandler {
    boolean permitAction(Action action);

    void receiveAction(Action action);
}
