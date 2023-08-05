package ru.netology.stats;

import java.util.Arrays;


public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = Arrays.stream(sales).sum();
        }
        return sum;
    }

    public int averageMonth(int[] sales) {
        int medium = 0;
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = Arrays.stream(sales).sum();
            medium = sum / sales.length;
        }
        return medium;
    }

    public int minAverageMonth(int[] sales) {
        int mediumt = 0;
        int minSall = 0;
        int sumt = 0;
        for (int i = 0; i < sales.length; i++) {
            sumt = Arrays.stream(sales).sum();
            mediumt = sumt / sales.length;
            if (sales[i] < mediumt) {
                minSall = minSall + 1;
            }
        }

        return minSall;
    }

    public int maxAverageMonth(int[] sales) {
        int mediuma = 0;
        int maxSalls = 0;
        int suma = 0;
        for (int i = 0; i < sales.length; i++) {
            suma = Arrays.stream(sales).sum();
            mediuma = suma / sales.length;
            if (sales[i] > mediuma) {
                maxSalls = maxSalls + 1;
            }
        }

        return maxSalls;
    }
}
