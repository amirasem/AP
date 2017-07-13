package game.action.api;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public interface Action {
    boolean isActionValid();

    void happen();

    String getName();
}
