import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write your age");
        int age = scanner.nextInt();
        System.out.println("write your Monthly income");
        int MonthlyIncome = scanner.nextInt();
        System.out.println("write your Credit score");
        int CreditScore = scanner.nextInt();
        System.out.println("write your numbers of years at current job");
        int yearsJob = scanner.nextInt();
        System.out.println("The applicant has no existing debt");
        boolean existingDebt = scanner.nextBoolean();

        boolean ageR = age >= 21 && age <= 65;
        boolean incomeR = MonthlyIncome >= 30000;
        boolean CScore = CreditScore >= 70;
        boolean yearsJ = yearsJob >= 2;
        boolean noDebt = !existingDebt;

        boolean extraCondition = yearsJ || noDebt;

        boolean approved = ageR && incomeR && CScore && extraCondition;

        System.out.println("Age requirement: " + (ageR ?"good" : "no"));
        System.out.println("Income requirement: " + (incomeR ?"good" : "no"));
        System.out.println("Credit score requirement: " + (CScore ?"good" : "no"));

        if(approved){
            System.out.println("Result: Loan Approved");
        }
        else{
            System.out.println("Result: Loan Unapproved");
        }
    }
}