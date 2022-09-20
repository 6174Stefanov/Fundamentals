package E1BasicsRewindEx;

import java.util.Scanner;

public class E7VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double insertedCoins = 0;
        double productPrice = 0;


        double nutsPrice = 2.0;
        double waterPrice = 0.7;
        double crispsPrice = 1.5;
        double sodaPrice = 0.8;
        double cokePrice = 1.0;

        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);
            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f%n", coins);
            } else {
                insertedCoins += coins;
            }
            command = scanner.nextLine();
        }
        command = scanner.nextLine();
        while (!command.equals("End")) {
            switch (command) {
                case "Nuts":
                    if (insertedCoins >= nutsPrice) {
                        System.out.printf("Purchased %s%n", command);
                        insertedCoins -= nutsPrice;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (insertedCoins >= waterPrice) {
                        System.out.printf("Purchased %s%n", command);
                        insertedCoins -= waterPrice;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (insertedCoins >= crispsPrice) {
                        System.out.printf("Purchased %s%n", command);
                        insertedCoins -= crispsPrice;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (insertedCoins >= sodaPrice) {
                        System.out.printf("Purchased %s%n", command);
                        insertedCoins -= sodaPrice;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (insertedCoins >= cokePrice) {
                        System.out.printf("Purchased %s%n", command);
                        insertedCoins -= cokePrice;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    if (insertedCoins >= 0) {
                        System.out.println("Invalid product");
                        System.out.printf("Change: %.2f%n", insertedCoins);
                    command = scanner.nextLine();
}
            }

            command = scanner.nextLine();
        }
        if (insertedCoins >= 0) {
            System.out.printf("Change: %.2f", insertedCoins);
        }
    }
}
//1
//1
//0.5
//0.6
//Start
//Coke
//Soda
//Crisps
//End