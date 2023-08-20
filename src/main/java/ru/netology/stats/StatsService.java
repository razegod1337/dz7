package ru.netology.stats;

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
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageMonth(int[] sales) {
        int avergSum = 0;
        int sumMonth = 0;

        sumMonth = sumSales(sales);
        avergSum = sumMonth / sales.length;

        return avergSum;
    }

    public int minAverageMonth(int[] sales) {
        int lessAvergMonth = 0;
        double avergSum = averageMonth(sales);

        for (long sale : sales) {
            if (sale <= avergSum) {
                lessAvergMonth++;
            }
        }
        return lessAvergMonth;
    }

    public int maxAverageMonth(int[] sales) {
        int aboveAvergMonth = 0;
        double avergSum = averageMonth(sales);

        for (long sale : sales) {
            if (sale >= avergSum) {
                aboveAvergMonth++;
            }
        }
        return aboveAvergMonth;
    }
}
