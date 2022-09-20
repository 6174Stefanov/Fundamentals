package E1BasicsRewindEx;

import java.util.Scanner;

public class E10Jedy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double lighsaberAmount = Math.ceil(students * 1.1);
        double freeBelts = students / 6.0;

        double totalLightsaberCost = lightsaberPrice * lighsaberAmount;
        double totalRobesCost = students * robesPrice;
        double totalBeltCost = Math.ceil(students - freeBelts) * beltsPrice;

        double totalCost = totalBeltCost + totalLightsaberCost + totalRobesCost;

        if (totalCost <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalCost - budget);
        }
    }
}
