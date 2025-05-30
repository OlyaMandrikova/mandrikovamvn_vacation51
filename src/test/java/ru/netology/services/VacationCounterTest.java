package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.params.provider.CsvFileSource;



public class VacationCounterTest {

    @ParameterizedTest
            @CsvFileSource(files="src/test/resources/Vacations.csv")
   // @CsvSource({
  //          "3, 10000, 3000, 20000",
   //         "2, 100000, 60000, 150000"
   // })

        //1
    void shouldCalculateForVacation(int expected, int income, int expenses, int threshold) {
        VacationCounter service = new VacationCounter();

        // подготавливаем данные:
        //int income = 10_000;
       // int expenses = 3_000;
      //  int threshold = 20_000;
        //int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

 /*   @Test
        //2
    void shouldCalculateForOneHundredThousands() {
        VacationCounter service = new VacationCounter();

        // подготавливаем данные:
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }*/
}