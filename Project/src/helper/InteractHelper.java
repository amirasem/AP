package helper;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public class InteractHelper {
    public static void main(String[] args) {
        String input = "MissionBoard DiningTable";
        String [] name = input.split(" ");
        for (int i = 0; i < name.length; i++) {
            System.out.println("public void interactWith" + name[i] + "()" +"{" +"return;"+"}");
        }
    }
}
