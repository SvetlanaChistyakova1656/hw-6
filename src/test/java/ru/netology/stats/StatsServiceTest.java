package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        // вызываем целевой метод:
        long actual = service.calculateSum(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        // вызываем целевой метод:
        long actual = service.calculateAverage(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;

        // вызываем целевой метод:
        int actual = service.findMaxSalesMonth(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        // вызываем целевой метод:
        int actual = service.findMinSalesMonth(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsBelowAverage() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.countMonthsBelowAverage(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsAboveAverage() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.countMonthsAboveAverage(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
