package game.action.complex.sell;

import game.entities.type.storage.BarnStorage;
import game.entities.type.living.animal.Animal;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public class SellAnimalAction extends Sell {
    public SellAnimalAction(Animal animal) {
        super(animal, animal.getPrice(), BarnStorage.getInstance());
    }
}