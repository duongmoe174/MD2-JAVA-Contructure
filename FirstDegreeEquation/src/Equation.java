import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        double a;
        double  b;

        Scanner inputCoefficient = new Scanner(System.in);

        System.out.print("input Coe a: ");
         a = inputCoefficient.nextDouble();

        System.out.print("input Coe b: ");
         b = inputCoefficient.nextDouble();

        double x = -b / a;
        System.out.println("Value of variable: " + x);
    }
}
