import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        int expectedMiles = (int) (cashValue * 100);
        assertEquals(expectedMiles, rewardValue.convertCashToMiles());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 5000;  // Assuming a conversion rate of $0.005 per mile
        var rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue * 0.0035;
        assertEquals(expectedCash, rewardValue.convertMilesToCash());
    }
}
class RewardValue{
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.milesValue = (int) (cashValue*100);
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue*0.0035;
    }

    public double getCashValue(){
        return cashValue;
    }
    public int getMilesValue(){
        return milesValue;
    }
    public int convertCashToMiles(){
        return (int) (cashValue * 100);
    }

    public double convertMilesToCash(){
        return milesValue *0.0035;
    }
}

