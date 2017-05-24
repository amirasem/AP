package helper;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public class GotoHelper {
    public static void main(String[] args) {
        String input = "BaseMarket Gym IntractableRanch Clinic LaboratoryMenu Cafe Workshop";

        String [] name = input.split(" ");
        for (int i = 0; i < name.length; i++) {
            System.out.println("public void goTo" + name[i]+"()" + "{" + "return;" +"}");
        }
    }
}
