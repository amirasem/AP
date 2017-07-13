package game.action.complex.material;

import game.entities.type.material.RockMetal;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public class MaterialNameHelper {
    private static MaterialNameHelper ourInstance = new MaterialNameHelper();

    public static MaterialNameHelper getInstance() {
        return ourInstance;
    }

    private MaterialNameHelper() {
    }
    RockMetal getMaterial (String name)
    {
        String[] part = name.split("_");
        switch (part[1]){
            case "WOOD" :
                return null;
            case "ROCKMETAL" :
                return RockMetal.valueOf(part[2]);
        }
        return null;
    }
}

