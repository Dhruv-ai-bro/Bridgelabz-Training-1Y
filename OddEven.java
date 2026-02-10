package com.java;
import java.util.Scanner;


public class OddEven {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the number of entries:");
        int n = c.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){
            arr[i] = c.nextInt();
        }

        for(int j=0;j<n;j++){
            if(arr[j]>=0){

                if(arr[j]%2==0){
                    System.out.println("The number is even and positive");
                }else{
                    System.out.println("The number is odd and positive");
                }

            }else{
                System.out.println("number is negative");
            }
        }

        if(arr[0]==arr[n-1]){
            System.out.println("The first and last number are equal");
        }else if(arr[0]>arr[n-1]){
            System.out.println("The first and last numbers are unequal");
        }else{
            System.out.println("The first and last numbers are not equal");
        }


    }
}
