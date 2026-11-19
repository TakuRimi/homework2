import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("write randome number");
        double number = new Scanner(System.in).nextDouble();

        if(number % 2 == 0)
            System.out.println("Your number is even");
        else
            System.out.println("Your number is odd");

    }
}