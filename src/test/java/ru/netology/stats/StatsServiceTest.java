package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void MinMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void AllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.Sum(sales);

        Assertions.assertEquals(expectedSales, actualSales);

    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 15;
        int actualSales = service.averageSum(sales);

        Assertions.assertEquals(expectedSales, actualSales);

    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 6;
        int actualSales = service.maxSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);

    }

    @Test
    public void belowTheAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 5;
        int actualSales = service.belowTheAverageSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void aboveTheAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 5;
        int actualSales = service.aboveTheAverageSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }
}