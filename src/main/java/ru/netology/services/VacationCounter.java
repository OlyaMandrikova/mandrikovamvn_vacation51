package ru.netology.services;

public class VacationCounter {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        // income - ежемесячный доход от работы
        // expenses - ежемесячные расходы
        // threshold - минимальный порог, когда можно отдыхать

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses - (((money - expenses) / 3) * 2);
            } else {
                money = money + income - expenses;
                /* System.out.println("Количество месяцев для отдыха в году - " + count);*/
            }
        }
        return count;

    }

}
