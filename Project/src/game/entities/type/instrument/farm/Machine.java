package game.entities.type.instrument.farm;

/**
 * Created by ahay on 4/21/17.
 * GIBILI GIBILI
 */
public enum  Machine {
    JUICER ("Status: A machine to extract juice from fruits and vegetables." , 1000) ,
    SPINNING_WHEEL("Status: A machine to make threads out of wool." , 2000) ,
    ULTIMATE_CHEESE_MAKER("Status: A machine to create cheese from milk." , 3000);


    private final String status;
    private final  int buyPrice ;
    Machine(String status, int buyPrice) {
        this.status = status;
        this.buyPrice = buyPrice;
    }

    public String getStatus() {
        return status;
    }
}
