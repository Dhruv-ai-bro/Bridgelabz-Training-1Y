package com.java;
import java.util.Scanner;


public class Height {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        double[] heights = new double[11];

        double sum = 0;

        for(int i=0;i<11;i++){
            heights[i] = c.nextDouble();
            sum = sum + heights[i];
        }
        double mean = sum/11;
        System.out.println("The mean of the heights is:" +mean);
    }
}
