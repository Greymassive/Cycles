package ru.netology.services.javacycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcMoneyServiceTest {

    @Test
    void lowValues() {
        CalcMoneyService service = new CalcMoneyService();
        int expected = 3;
        int actual = service.calcMoney(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void highValues() {
        CalcMoneyService service = new CalcMoneyService();
        int expected = 2;
        int actual = service.calcMoney(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }
}
