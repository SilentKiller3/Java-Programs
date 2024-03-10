package iraj;

import java.util.Scanner; // Importing  the Scanner class

public class J05_takingInput {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //(Creating an object named "sc" of the Scanner class.)

        System.out.println("Enter a number");
//        int num = sc.nextInt(); //(Method to read from the keyboard)
//        System.out.println("Enter a string");
//        String str = sc.next();
//        System.out.println("Enter a float number");
//        float num1 = sc.nextFloat();
//
//       // System.out.println(num + str + num1);
//        System.out.println(num);
//        System.out.println(str);
//        System.out.println(num1);

        boolean b1 = sc.hasNextDouble();
        System.out.println(b1);

    }
}
