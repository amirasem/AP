package game.action.simple.field.empty;

import game.action.api.Action;
import game.interactable.field.EmptyCourt;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
abstract class EmptyCourtAction implements Action {
    protected final EmptyCourt court;

    EmptyCourtAction(EmptyCourt court) {
        this.court = court;
    }
}
