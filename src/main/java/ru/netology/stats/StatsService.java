package ru.netology.stats;

public class StatsService {
    public int calculateSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }

        return sum;


    }

    public int calculateAverageSumSales(int[] sales) {
        int averagesum = calculateSumSales(sales) / 12;

        return averagesum;
    }


    public int getMaxSum(int[] sales) {
        int maxSum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSum]) {
                maxSum = i;
            }
        }
        return maxSum;
    }

    public int getMinSum(int[] sales) {
        int minSum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSum]) {
                minSum = i;
            }
        }
        return minSum;
    }

    public int calculateMonthsLowSales(int[] sales) {
        int month = 0;
        int average = calculateAverageSumSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {

                month++;


            }
        }
        return month;
    }

    public int calculateMonthsHighSales(int[] sales) {
        int monthsales = 0;
        int average = calculateAverageSumSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthsales++;
            }
        }
        return monthsales;
    }

}

