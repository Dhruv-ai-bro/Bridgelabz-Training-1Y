package com.java;
import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        double sum=0;
        System.out.println("enter the array");
        double[] arr = new double[10];

        int i=0;


        while(i<10){
            arr[i] = c.nextInt();

            if(arr[i]<=0){
                break;
            }

            sum +=arr[i];
            i++;

        }

        System.out.println("The sum of the elements is:"+sum);

    }
}
