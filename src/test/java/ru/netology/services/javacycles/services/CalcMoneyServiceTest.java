package ru.netology.services.javacycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcMoneyServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/values.csv")
    void values(int expected, int income, int expences, int threshold) {
        CalcMoneyService service = new CalcMoneyService();

        int actual = service.calcMoney(income, expences, threshold);

        Assertions.assertEquals(expected, actual);
    }


}
