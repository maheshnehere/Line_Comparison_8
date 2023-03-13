package Bridgelabz;
import java.util.*;
public class Numbercomparison {
    void numLength() {
        System.out.println("Welcome to num Comparison Computation Program");

        try (Scanner num = new Scanner(System.in)) {
            System.out.println("Enter A1 Co-ordinate = ");
            double A1 = num.nextDouble();
            System.out.println("Enter A2 Co-ordinate = ");
            double A2 = num.nextDouble();
            System.out.println("Enter B1 Co-ordinate = ");
            double B1 = num.nextDouble();
            System.out.println("Enter B2 Co-ordinate = ");
            double B2 = num.nextDouble();

            double length1 = Math.sqrt(Math.pow(A2 - A1, 2) + Math.pow(B2 - B1, 2));

            System.out.println("Length of a num = " + length1);
        }
    }
    public static void main(String[] args) {
        Numbercomparison runner = new Numbercomparison();
        runner.numLength();
    }
}