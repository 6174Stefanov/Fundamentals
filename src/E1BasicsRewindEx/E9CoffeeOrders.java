package E1BasicsRewindEx;

import java.util.Scanner;

public class E9CoffeeOrders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int orders = Integer.parseInt(scanner.nextLine());
        double ordersPrice = 0;
        for (int i = 1; i <= orders; i++) {
            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleAmount = Integer.parseInt(scanner.nextLine());

            double price = (capsuleAmount * days) * capsulePrice;
            System.out.printf("The price for the coffee is: $%.2f%n", price);


            ordersPrice = ordersPrice + price;
        }
        System.out.printf("Total: $%.2f", ordersPrice);
    }
}
