package roflan;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        String[] month = new String[12];
        month[0]="January";     month[1]="February";    month[2]="March";       month[3]="April";
        month[4]="May";         month[5]="June";        month[6]="July";        month[7]="August";
        month[8]="September";   month[9]="October";     month[10]="November";   month[11]="December";
        Scanner in = new Scanner(System.in);
        int mon = in.nextInt();
        while (mon < 1 || mon > 12){
            System.out.println("Error!");
            mon = in.nextInt();
        }
        System.out.println( month[mon-1] );
    }
}
