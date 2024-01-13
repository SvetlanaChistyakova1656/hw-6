package ru.netology.stats;
    public class StatsService {

        // Рассчитать сумму всех продаж
        public long calculateSum(long[] sales) {
            long sum = 0;
            for (long sale : sales) {
                sum += sale;
            }
            return sum;
        }

        // Рассчитать среднюю сумму продаж в месяц
        public long calculateAverage(long[] sales) {
            long sum = calculateSum(sales);
            return sum / sales.length;
        }

        // Номера месяцев с пиком продаж (наибольшей суммой продаж)
        public int findMaxSalesMonth(long[] sales) {
            long maxSales = sales[0];
            int maxMonth = 0;
            for (int i = 1; i < sales.length; i++) {
                if (sales[i] > maxSales) {
                    maxSales = sales[i];
                    maxMonth = i;
                }
            }
            return maxMonth + 1;
        }

        // Номер месяца с минимальными продажами
        public int findMinSalesMonth(long[] sales) {
            long minSales = sales[0];
            int minMonth = 0;
            for (int i = 1; i < sales.length; i++) {
                if (sales[i] < minSales) {
                    minSales = sales[i];
                    minMonth = i;
                }
            }
            return minMonth + 1;
        }

        // Количество месяцев с продажами ниже средней
        public int countMonthsBelowAverage(long[] sales) {
            long average = calculateAverage(sales);
            int count = 0;
            for (long sale : sales) {
                if (sale < average) {
                    count++;
                }
            }
            return count;
        }

        // Количество месяцев с продажами выше средней
        public int countMonthsAboveAverage(long[] sales) {
            long average = calculateAverage(sales);
            int count = 0;
            for (long sale : sales) {
                if (sale > average) {
                    count++;
                }
            }
            return count;
        }
    }



