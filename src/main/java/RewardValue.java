public class RewardValue {
    public Main(int cashValue, int milesValue) {
        cash = cashValue;
        miles = milesValue;
    }

    static void getCashValue(RewardValue input) {
        return input.miles / 0.0035;
    }

    static void getMilesValue(RewardValue input) {
        return input.cash / 0.0035;
    }
}
