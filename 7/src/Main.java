import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("write total($): ");
        double total = scanner.nextDouble();

        System.out.println("are you  premium? (true / false): ");
        boolean isPremium = scanner.nextBoolean();

        System.out.println("amount previous orders: ");
        int previousOrders = scanner.nextInt();

        System.out.println("has you coupon ? (true / false): ");
        boolean hasCoupon = scanner.nextBoolean();

        System.out.println("current month - birth Month? (true / false): ");
        boolean birthdayMonth = scanner.nextBoolean();

        int discountPercent = 0;

        if (total >= 200 && isPremium && (hasCoupon || birthdayMonth)) {
            discountPercent = 20;
        }
        else if (total >= 150 && (isPremium || previousOrders >= 10)) {
            discountPercent = 15;
        }
        else if (total >= 100 && hasCoupon) {
            discountPercent = 10;
        }

        double discountAmount = total * discountPercent / 100;
        double finalPrice = total - discountAmount;

        System.out.println("total price: $" + total);
        if (discountPercent > 0) {
            System.out.println("Discount: " + discountPercent + "%");
            System.out.println("Discount amount: $" + discountAmount);
            System.out.println("total price: $" + finalPrice);
        } else {
            System.out.println("discount: no");
            System.out.println("total price: $" + finalPrice);
        }

        scanner.close();
    }
}