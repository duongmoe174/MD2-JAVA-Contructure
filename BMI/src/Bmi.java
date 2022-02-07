import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner inputWH = new Scanner(System.in);

        System.out.println("enter your weight: ");
        double weight = inputWH.nextDouble();

        System.out.println("enter your height: ");
        double height = inputWH.nextDouble();

        double bmi = weight / (height*height);
        System.out.printf("%-20s%s", bmi, "Interpretation\n");

        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (bmi < 20.5) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi <30 ) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
