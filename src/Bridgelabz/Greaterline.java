package Bridgelabz;
import java.util.Scanner;
public class Greaterline {
    void greaterLine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Line 1 inputs :");
        System.out.println("Enter x1 Co-ordinate = ");
        double x1 = sc.nextDouble();
        System.out.println("Enter x2 Co-ordinate = ");
        double x2 = sc.nextDouble();
        System.out.println("Enter y1 Co-ordinate = ");
        double y1 = sc.nextDouble();
        System.out.println("Enter y2 Co-ordinate = ");
        double y2 = sc.nextDouble();
        System.out.println("Line 2 inputs :");
        System.out.println("Enter p1 Co-ordinate = ");
        double p1 = sc.nextDouble();
        System.out.println("Enter p2 Co-ordinate = ");
        double p2 = sc.nextDouble();
        System.out.println("Enter q1 Co-ordinate = ");
        double q1 = sc.nextDouble();
        System.out.println("Enter q2 Co-ordinate = ");
        double q2 = sc.nextDouble();


        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double length2 = Math.sqrt(Math.pow(p2 - p1, 2) + Math.pow(q2 - q1, 2));

        if (length1 == length2) {
            System.out.println("Two Lines are Equal.");
        } else if (length1 > length2) {
            System.out.println("Line 1 is greater than Line 2.");
        } else {
            System.out.println("Line 2 is greater than Line 1");
        }
    }
    public static void main(String[] args) {
        Greaterline runner = new Greaterline();
        runner.greaterLine();
    }
    
}
