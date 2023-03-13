package Bridgelabz;

import java.util.Scanner;
public class Lineequal {
    void lineEquality() {
        Scanner num = new Scanner(System.in);
        System.out.println("Line 1 inputs :");
        System.out.println("Enter A1 Co-ordinate = ");
        double A1 = num.nextDouble();
        System.out.println("Enter A2 Co-ordinate = ");
        double A2 = num.nextDouble();
        System.out.println("Enter B1 Co-ordinate = ");
        double B1 = num.nextDouble();
        System.out.println("Enter B2 Co-ordinate = ");
        double B2 = num.nextDouble();
        System.out.println("Line 2 inputs :");
        System.out.println("Enter C1 Co-ordinate = ");
        double C1 = num.nextDouble();
        System.out.println("Enter C2 Co-ordinate = ");
        double C2 = num.nextDouble();
        System.out.println("Enter D1 Co-ordinate = ");
        double D1 = num.nextDouble();
        System.out.println("Enter D2 Co-ordinate = ");
        double D2 = num.nextDouble();

        double Size1 = Math.sqrt(Math.pow(A2 - A1, 2) + Math.pow(B2 - B1, 2));
        double Size2 = Math.sqrt(Math.pow(C2 - C1, 2) + Math.pow(D2 - D1, 2));

        if(Size1 == Size2) {
            System.out.println("Two Lines are Equal.");
        }else {
            System.out.println("Two Lines are not Equal.");
        }
    }
    public static void main(String[] args) {
        Lineequal runner = new Lineequal();
        runner.lineEquality();
    }
}
