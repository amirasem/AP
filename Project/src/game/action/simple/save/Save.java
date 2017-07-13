package game.action.simple.save;

import java.io.File;

/**
 * Created by AmirHosein on 7/4/2017.
 * ASAY
 */
public class Save {
    private String name ;
    private File saveFile ;
    public Save(String name , File save)
    {
        this.name = name ;
        this.saveFile = save;
    }
    public String getName(){
        return name;
    }
    public File getSaveFile(){
        return saveFile;
    }
}
