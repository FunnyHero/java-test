package roflan;

import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int n = 4;
        Student[] students = new Student[n];
        students[0]=new Student(228,"Kek", "Daunovich",
                "Roflanov", new Date((byte) 12, (byte) 11,2000),
                new Address("Russia","Tver","Tver","Pushkina", 54,"G",1488),
                "+7012301203", "Math", (byte) 3,"M-44");
        students[1]=new Student(322,"Ricardo", "",
                "Milos", new Date((byte) 11, (byte) 11,1977),
                new Address("USA","Florida","Miami","5th St", 45,"",1337),
                "+709798789", "Flex", (byte) 5,"F-35");
        students[2]=new Student(69,"William", "",
                "Herrington", new Date((byte) 14, (byte) 7,1969),
                new Address("USA","New York State","New York","Hawthorne St", 69,"",1),
                "+769696969", "Gachi", (byte) 5,"G-54");
        students[3]=new Student(96,"Van", "",
                "Darkholme", new Date((byte) 24, (byte) 8,1972),
                new Address("Vietnam","Hanoi","Hanoi","Hao Nam St", 43,"",5),
                "+7999878345", "Gachi", (byte) 5,"G-54");

        Scanner in = new Scanner(System.in);
        String faculty = in.nextLine();
        for (int i = 0; i < n; i++) {
            if (faculty.equals(students[i].getFaculty()))
                System.out.println(students[i].toString());
        }

        System.out.println(Arrays.toString(students));

        int year = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (year == students[i].getDateOfBirth().getYear())
                System.out.println(students[i].toString());
        }

        String group = in.next();
        for (int i = 0; i < n; i++) {
            if (group.equals(students[i].getGroup()))
                System.out.println(students[i].toString());
        }
    }
}
