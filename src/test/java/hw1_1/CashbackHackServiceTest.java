package hw1_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturnZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int result = service.remain(amount);
        Assertions.assertTrue(result == 0);
    }

    @Test
    void shouldReturn400() {
        CashbackHackService service = new CashbackHackService();
        int amount = 600;

        int result = service.remain(amount);
        Assertions.assertTrue(result == 400);
    }

    @Test
    void shouldReturn800() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2200;

        int result = service.remain(amount);
        Assertions.assertTrue(result == 800);
    }
}