package ru.netology.stats;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();


        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.calculateSumSales(sales));

        System.out.println(service.calculateAverageSumSales(sales));

        System.out.println(service.getMaxSum(sales));

        System.out.println(service.getMinSum(sales));

        System.out.println(service.calculateMonthsLowSales(sales));

        System.out.println(service.calculateMonthsHighSales(sales));

    }
}
