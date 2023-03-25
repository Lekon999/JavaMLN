package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) { // Номер месяца, в котором был минимум продаж
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int Sum(long[] sales) { // Сумму всех продаж
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }
        return sumSales;
    }

    public int averageSum(long[] sales) { // Среднюю сумму продаж в месяц
        int averageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSales += sales[i];
        }
        return averageSales / 12;
    }

    public int maxSales(long[] sales) { // Номер месяца, в котором был пик продаж
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int belowTheAverageSales(long[] sales) {  // Количество месяцев, в которых продажи были ниже среднего
        int belowMonth = 0;
        int averageSum = 15;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                belowMonth++;
            }
        }
        return belowMonth;
    }

    public int aboveTheAverageSales(long[] sales) {  // Количество месяцев, в которых продажи были выше среднего
        int aboveMonth = 0;
        int averageSum = 15;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                aboveMonth++;
            }
        }
        return aboveMonth;
    }
}


