package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StatsServiceTest {

    @Test
    public void TotalSalesTest() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long[] sales = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int actual = service.totalSales(sales);
        int expected = 120;
        assertEquals(expected, actual);
    }

    @Test
    public void AverageSaleTest() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long[] sales = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int actual = service.averageSale(sales);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void minMonthTest() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long[] sales = {10, 10, 10, 0, 10, 10, 10, 10, 10, 10, 10, 10};
        int actual = service.minSales(sales);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void maxMonthTest() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long[] sales = {10, 10, 10, 11, 10, 10, 10, 10, 10, 10, 10, 10};
        int actual = service.maxSales(sales);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void BASMonthsTest() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long[] sales = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int actual = service.belowAverageSales(sales);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void AASMonthsTest() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long[] sales = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int actual = service.aboveAverageSales(sales);
        int expected = 0;
        assertEquals(expected, actual);
    }
}