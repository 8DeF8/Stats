package ru.netology.stats;

public class StatsService {
    public int sumOfAllSales(int[] sales) {
        int sumSales = 0;
        for (int sale : sales) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public int averageMonthlySales(int[] sales) {
        return sumOfAllSales(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsBellowAverage(int[] sales) {
        int monthsBellow = 0;
        double bellow = averageMonthlySales(sales);

        for (int sale : sales) {
            if (sale <= bellow) {
                monthsBellow++;
            }
        }
        return monthsBellow;
    }

    public int monthsAboveAverage(int[] sales) {
        int monthsAbove = 0;
        double above = averageMonthlySales(sales);

        for (int sale : sales) {
            if (sale >= above) {
                monthsAbove++;
            }
        }
        return monthsAbove;
    }
}
