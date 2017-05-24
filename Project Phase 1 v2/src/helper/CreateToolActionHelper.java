package helper;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public class CreateToolActionHelper {
    public static void main(String[] args) {
        String[] names = ("SHOVEL: STONE IRON SILVER ADAMANTIUM PICK: STONE IRON SILVER ADAMANTIUM AXE: STONE IRON SILVER ADAMANTIUM SPRINKLER: LITTLE LOG PINES OAK STONE IRON SILVER ADAMANTIUM COOK_TOOL: PAN AGITATOR POT KNIFE OVEN").split(" ");

        String type = "";
        for (String s : names) {
            if (s.endsWith(":")) type = s.substring(0, s.length() - 1);
            else System.out.println("CREATE_" + type + "_" + s + ",");
        }

    }
}
