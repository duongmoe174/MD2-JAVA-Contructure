import java.util.Scanner;
public class CalculatorDate {
    public static void main(String[] args) {
        Scanner inputMonth = new Scanner(System.in);

        System.out.println("Which month?: ");
        int month = inputMonth.nextInt();

        switch (month) {
            case 2 -> System.out.println("28 or 29");
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31day!");
            case 4, 6, 9, 11 -> System.out.println("30day");
            default -> System.out.println("That month is suck!");
        }
    }
}
