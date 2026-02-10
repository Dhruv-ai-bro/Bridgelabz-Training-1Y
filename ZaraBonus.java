package com.java;
import java.util.Scanner;


public class ZaraBonus {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        int n = 10;

        double[] salary = new double[n];
        double[] service = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;


        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            salary[i] = c.nextDouble();

            System.out.print("Enter years of service: ");
            service[i] = c.nextDouble();


            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid input! Enter again.");
                i--;
            }
        }


        for (int i = 0; i < n; i++) {

            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }


        System.out.println( "Zara Bonus Summary");
        System.out.println("Total Old Salary  : " + totalOldSalary);
        System.out.println("Total Bonus Paid  : " + totalBonus);
        System.out.println("Total New Salary  : " + totalNewSalary);


    }

}