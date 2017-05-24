package helper;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class An {
    private static An ourInstance = new An();

    public static An getInstance() {
        return ourInstance;
    }

    private An() {
    }
}
