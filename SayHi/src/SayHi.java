import java.util.Scanner;

public class SayHi {
    public static void main(String[] args) {
        Scanner sayHi = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sayHi.nextLine();
        System.out.println("Hi " + name);
    }
}
