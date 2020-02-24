package roflan;

import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr= new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        for (int i = arr.length-1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        System.out.println("The shortest number = " + arr[0] + ", the longest number = " + arr[arr.length-1]);
        System.out.println(Arrays.toString(arr));
    }
}
