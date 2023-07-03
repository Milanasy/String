package ru.netology.stats;

public class SalesStatistics {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }

        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int findPeakMonth(long[] sales) {
        int peakMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[peakMonth]) {
                peakMonth = i;
            }
        }
        return peakMonth + 1;
    }

    public int findMinMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }
    public int monthsBellowAverage (long[] sales) {
        int counter = 0;
        long average = average(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }
    public int monthsAboveAverage (long[] sales) {
        int counter = 0;
        long average = average(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }
}




