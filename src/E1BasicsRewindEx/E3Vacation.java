package E1BasicsRewindEx;

import java.util.Scanner;

public class E3Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;
        if (groupType.equals("Students")) {
            if (dayOfWeek.equals("Friday")) {
                price = 8.45;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 9.80;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 10.46;
            }
        } else if (groupType.equals("Business")) {
            if (dayOfWeek.equals("Friday")) {
                price = 10.90;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 15.60;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 16;
            }
        } else if (groupType.equals("Regular")) {
            if (dayOfWeek.equals("Friday")) {
                price = 15;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 20;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 22.50;
            }
        }
        double totalPrice = people * price;
        if (groupType.equals("Students") && people >= 30) {
            totalPrice = totalPrice * 0.85;
        } else if (groupType.equals("Business") && people >= 100) {
            totalPrice = (people - 10) * price;
        } else if (groupType.equals("Regular") && people >= 10 && people <=20) {
            totalPrice = totalPrice * 0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}