package helper;

/**
 * Created by ahay on 5/2/17.

 GIBILI GIBILI

 */
public class AddPlaceHelper {
    public static void main(String[] args) {
        String input  = "River Cave";
        String [] name = input.split(" ");
        for (int i = 0; i < name.length; i++) {
            System.out.println("addIntractable(Jungle.getInstance()," + name[i] + ".getInstance())");
        }
                //addIntractable(Farm.getInstance(), Barn.getInstance())
    }
}
