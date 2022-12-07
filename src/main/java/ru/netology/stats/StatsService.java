package ru.netology.stats;

public class StatsService {
    public int totalSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) sum = (int) (sum + sale);
        return sum;
    }

    public int averageSale(long[] sales) {
        int sum = totalSales(sales);
        return sum / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        int averSale = averageSale(sales);
        int bASMonths = 0;
        for (long sale : sales) {
            if (sale < averSale) {
                bASMonths = bASMonths + 1;
            }
        }
        return bASMonths;
    }

    public int aboveAverageSales(long[] sales) {
        int averSale = averageSale(sales);
        int aASMonths = 0;
        for (long sale : sales) {
            if (sale > averSale) {
                aASMonths = aASMonths + 1;
            }
        }
        return aASMonths;
    }
}

