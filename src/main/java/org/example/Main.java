package org.example;

import ru.netology.stats.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.print("Продажи по месяцам: " + Arrays.toString(sales));

        StatsService service = new StatsService();

        int sum = service.totalSales(sales);
        System.out.print(System.lineSeparator() + "Сумма продаж за период: " + sum);

        int averSale = service.averageSale(sales);
        System.out.print(System.lineSeparator() + "Средняя продажа в месяц: " + averSale);

        int minMonth = service.minSales(sales);
        System.out.print(System.lineSeparator() + "Минимальные продажи были в " + minMonth + "-м месяце.");

        int maxMonth = service.maxSales(sales);
        System.out.print(System.lineSeparator() + "Максимальные продажи были в " + maxMonth + "-м месяце.");

        int bASMonths = service.belowAverageSales(sales);
        System.out.print(System.lineSeparator() + "Количество месяцев с продажами ниже среднего уровня: " + bASMonths);

        int aASMonths = service.aboveAverageSales(sales);
        System.out.print(System.lineSeparator() + "Количество месяцев с продажами выше среднего уровня: " + aASMonths);

    }
}