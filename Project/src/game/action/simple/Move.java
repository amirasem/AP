package game.action.simple;

import game.main.Game;
import game.action.api.Action;
import game.places.Place;

/**
 * Created by ahay on 5/1/17.
 * GIBILI GIBILI
 */
public class Move implements Action {
    private final Place source;
    private final Place destination;

    public Move(Place source, Place destination) {
        this.source = source;
        this.destination = destination;
    }


    @Override
    public boolean isActionValid() {
        return Game.getInstance().getPlace().equals(source);
    }

    @Override
    public void happen() {
        Game.getInstance().setPlace(destination);
    }

    @Override
    public String getName() {
        return "Move";
    }
}
