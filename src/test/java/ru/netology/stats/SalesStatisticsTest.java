package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesStatisticsTest {
    @Test
    public void testSum() {
        SalesStatistics service = new SalesStatistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18;

        Assertions.assertEquals(expected, actual);
        System.out.println("Cумма всех продаж: "+ expected+ ";");
    }

    @Test
    public void testAverage() {
        SalesStatistics service = new SalesStatistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = (8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18) / 12;

        Assertions.assertEquals(expected, actual);
        System.out.println("Средняя сумма продаж в месяц: "+ expected+ ";");
    }
    @Test
    public void testfindPeakMonth() {
        SalesStatistics service = new SalesStatistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.findPeakMonth(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
        System.out.println("Продажи на максимальную сумму были осуществлены в "+ expected+ " месяце;");
    }
    @Test
    public void testfindMinMonth() {
        SalesStatistics service = new SalesStatistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.findMinMonth(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
        System.out.println("Продажи на минимальную сумму были осуществлены в "+ expected+ " месяце;");
    }
    @Test
    public void testmonthsBellowAverage() {
        SalesStatistics service = new SalesStatistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthsBellowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: "+ expected+ ";");
    }
    @Test
    public void testmonthsAboveAverage() {
        SalesStatistics service = new SalesStatistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthsAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев, в которых продажи были выше среднего: "+ expected+ ";");
    }
}