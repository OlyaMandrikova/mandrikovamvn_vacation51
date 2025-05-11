package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationCounterTest {

    @Test
        //1
    void shouldCalculateForTenThousands() {
        VacationCounter service = new VacationCounter();

        // подготавливаем данные:
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        long expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
        //2
    void shouldCalculateForOneHundredThousands() {
        VacationCounter service = new VacationCounter();

        // подготавливаем данные:
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        long expected = 2;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}