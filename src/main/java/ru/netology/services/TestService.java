package ru.netology.services;


public class TestService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        long money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать? expenses-затраты
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income - expenses; // income - заработал
            }
        }
        return count;
    }
}