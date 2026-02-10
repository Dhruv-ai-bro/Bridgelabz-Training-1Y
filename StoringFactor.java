package com.java;
import java.util.Scanner;

public class StoringFactor {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = c.nextInt();
        int index = 0;
        int arr[] = new int[n];
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[index] = i;
                index++;
            }
        }

        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
        }
    }
}
