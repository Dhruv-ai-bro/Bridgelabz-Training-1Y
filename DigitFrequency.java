package com.java;
import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);


        System.out.print("Enter a number: ");
        long number = c.nextLong();

        long temp = number;
        int count = 0;


        while (temp != 0) {
            count++;
            temp = temp / 10;
        }


        int[] digits = new int[count];
        temp = number;

        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp = temp / 10;
        }


        int[] frequency = new int[10];

        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }


        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " : " + frequency[i]);
            }
        }


    }
}
