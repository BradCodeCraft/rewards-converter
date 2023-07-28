public class RewardValue {
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    
    public RewardValue(double cashValue, int milesValue) {
        this.cash = cashValue;
        this.miles = milesValue;
    }

    private static double convertToCash(RewardValue input) {
        return this.miles * MILES_TO_CASH_CONVERSION_RATE;
    }

    private static int convertToMiles(RewardValue input) {
        return (int) this.cash / MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cash)
    }
}
