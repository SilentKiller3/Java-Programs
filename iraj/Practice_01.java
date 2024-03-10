package iraj;

import java.util.Scanner;

public class Practice_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full marks of all the subjects:");
        int fullMarks = sc.nextInt();

        System.out.println("""
                Enter the marks obtained of all subjects respectively for:
                English
                Maths
                Science
                Nepali
                Computer""");
        float eng = sc.nextFloat();
        float maths = sc.nextFloat();
        float science = sc.nextFloat();
        float nep = sc.nextFloat();
        float comp = sc.nextFloat();

        float percent = ((eng + maths + science + nep + comp)/(fullMarks*5))*100;
        System.out.println("Marks obtained:");
        System.out.println("English = " + eng);
        System.out.println("Maths = " + maths);
        System.out.println("Science = " + science);
        System.out.println("Nepali = " + nep);
        System.out.println("Computer = " + comp);
        System.out.println("The percentage obtained by the student = " + percent + "%");
    }
}
