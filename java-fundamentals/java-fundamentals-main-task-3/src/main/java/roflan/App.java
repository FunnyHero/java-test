package roflan;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        double [] arr = new double[amount];
        for (int i = 0; i < amount; i++) {
            arr[i]=Math.random();
            System.out.println(arr[i]);
        }
        for (int i = 0; i < amount; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
