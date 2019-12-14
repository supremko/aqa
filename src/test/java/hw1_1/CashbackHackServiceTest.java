package hw1_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/CashbackData.csv", numLinesToSkip = 1)
    void calculateCashback(int amount, int expected, String message) {
    CashbackHackService service = new CashbackHackService();

    int actual = service.remain(amount);

    assertEquals(expected, actual, message);
    }
}