package helper;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public class SellNameHelper {
    public static void main(String[] args) {
        String input = "PEAR PEACH EGGPLANT LETTUCE GARLIC PEAS POMEGRANATE LEMON CUCUMBERS WATERMELON TURNIP ORANGE APPLE ONION POTATO CARROT TOMATO MELON PINEAPPLE STRAWBERRY PAPER";
        String[] name = input.split(" ");
        for (int i = 0; i < name.length; i++) {
            System.out.println( " case \"" + name[i] +"\":\n" + "return Fruit.valueOf(parts[2]);\n");
        }
    }
}
