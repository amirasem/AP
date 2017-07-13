package helper;

import java.util.Scanner;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class SingleToneHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String s = scanner.next();

        singletone("game.action.complex.tools.NameHelperTool");
        String[] names =
                "CommandLineHelper.java Barn.java  Cave.java  Farm.java  Field.java  FruitGarden.java  Gym.java  Home.java  Jungle.java  LaboratoryMenu.java  Place.java  Pond.java  River.java  store  Village.java Butchery.java  Cafe.java  Clinic.java  GeneralStore.java  Greenhouse.java  GroceryStore.java  BaseMarket.java  IntractableRanch.java  Workshop.java"
                        .split(" ");
        for (String s : names) {
            try {
                s = s.substring(0, s.length() - 5);
                singletone(s);
            } catch (Exception e) {

            }
        }
    }

    private static void singletone(String s) {
        System.out.println(" private static " + s + " ourInstance = new " + s + "();\n" +
                "\n" +
                "    public static " + s + " getInstance() {\n" +
                "        return ourInstance;\n" +
                "    }\n" +
                "\n" +
                "    private " + s + "() {\n" +
                "    }");
    }
}
