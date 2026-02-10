package com.java;
import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the multiplication number");
        int n = c.nextInt();
        for(int i=1;i<=10;i++){
            int mul = n*i;
            System.out.println(mul);
        }
    }
}
