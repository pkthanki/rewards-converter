
public class RewardValue
{
private double cashValue; // Creating Variables for this class to access
private int milesValue; // Creating Variables for this class to access
public RewardValue(double cashValue)  //
{
    this.cashValue=cashValue;
}

public RewardValue(int milesValue){
    this.milesValue=milesValue;
    }

    public double getCashValue() {
        return milesValue*0.0035;
    }

    public double getMilesValue() {
        return cashValue/0.0035;
    }
}
