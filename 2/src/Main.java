import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        double age = new Scanner(System.in).nextDouble();

        if(age > 18)
            System.out.println("You can vote");
        else if(age < 18)
            System.out.println("You can not vote");
    }
}