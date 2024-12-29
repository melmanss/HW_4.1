package app;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        String productName1 = "smartphone";
        double totalSales1 = 12153.41;
        int salesDays1 = 5;
        double dailySales1 = totalSales1 / salesDays1;
        String productName2 = "laptop";
        double totalSales2 = 10486.85;
        int salesDays2 = 7;
        double dailySales2 = totalSales2 / salesDays2;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Product No 1: " + productName1);
        System.out.println("Total sales for " + salesDays1 + " days: EUR " + df.format (totalSales1));
        System.out.println("Sales by day: EUR " + df.format (dailySales1) + "\n");
        System.out.println("Product No 2: " + productName2);
        System.out.println("Total sales for " + salesDays2 + " days: EUR " + df.format (totalSales2));
        System.out.println("Sales by day: EUR " + df.format (dailySales2));
    }
}
