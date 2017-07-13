package game.action.simple.save;

import game.action.api.Action;

import java.io.*;

/**
 * Created by AmirHosein on 7/4/2017.
 * ASAY
 */
public class SaveMechnaism implements Serializable , Action {
        Integer money, health, satiety , stamina , time; // Integer and String
        String name;  // also implement Serializable



        static SaveMechnaism allMyState = new SaveMechnaism();

        public static void main(String[] args) throws IOException {
            try(ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(new File("myFile.data")))) {
                // no need to specify members individually
                oos.writeObject(allMyState);
            }catch (IOException e){
                e.printStackTrace();
            }
        }

//  TODO : bayad ye kari kard ke vaghti mikhad yek save dorost kone bere az kelase save ye done new kone va neghahdare
    @Override
    public boolean isActionValid() {
        return false;
    }

    @Override
    public void happen() {

    }
    public void makeSave(String name , File file){
            new Save(name , file);
    }

    @Override
    public String getName() {
        return null;
    }
}
