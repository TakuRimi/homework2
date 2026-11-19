import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("write 3 numbers: attendance points(max 10,homework points(max 60),exam points(max 30)");
        int attendance = new Scanner(System.in).nextInt();
        int Homework = new Scanner(System.in).nextInt();
        int exam = new Scanner(System.in).nextInt();

        int totalPoints = attendance + Homework + exam;
        if(totalPoints >= 65 && attendance >= 6 && exam >= 17){
            System.out.println("you passed");6
        }
        else {
            System.out.println("you failed");
        }
        System.out.println("you points: " + totalPoints);


    }
}