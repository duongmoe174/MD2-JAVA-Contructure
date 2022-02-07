import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        float wight;
        float height;

        Scanner inputWH = new Scanner(System.in);

        System.out.println("Enter Wight: ");
        wight = inputWH.nextFloat();

        System.out.println("Enter Height: ");
        height = inputWH.nextFloat();

        float area = wight * height;

        System.out.println("Diện tích hình CN là: " + area);
    }
}
