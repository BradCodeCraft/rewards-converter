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
        double cashValue = 1;
        int milesValue = (int) 285.714285714;
        var rewardValue = new RewardValue(cashValue);
        int rewardMilesValue = rewardValue.getMilesValue();
        assertEquals(milesValue, rewardMilesValue);
    }

    @Test
    void convert_from_miles_to_cash() {
        double cashValue = 35;
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double rewardCashValue = rewardValue.getCashValue();
        assertEquals(cashValue, rewardCashValue);
    }
}
