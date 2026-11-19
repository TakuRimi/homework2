import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("write first number");
        double a = new Scanner(System.in).nextDouble();

        System.out.println("write arithmetic operation");
        char operation = new Scanner(System.in).nextLine().charAt(0);

        System.out.println("write second number");
        double b = new Scanner(System.in).nextDouble();


        switch(operation){
            case '+':
                System.out.println(a + b);break;
            case '-':
                System.out.println(a - b);break;
            case '*':
                System.out.println(a * b);break;
            case '/':
                if(a == 0 || b == 0) {
                    System.out.println("0 is not allowed");
                    return;
                }
                System.out.println(a / b);break;
        }


    }
}