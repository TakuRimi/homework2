import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 3 nubers");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        double c = new Scanner(System.in).nextDouble();

        if(a > b && b > c)
            System.out.println("a is greater than c");
        else if(b > a && a > c)
            System.out.println("b is greater than c");
        else if(c > b && b > a)
            System.out.println("c is greater than a");
        else if(c > a && a > b)
            System.out.println("c is greater than b");
        else if(a > c && c > b)
            System.out.println("a is greater than b");
        else if(b > c && c > a)
            System.out.println("b is greater than a");

    }
}