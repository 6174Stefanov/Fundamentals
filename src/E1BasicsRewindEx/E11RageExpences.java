package E1BasicsRewindEx;

import java.util.Scanner;

public class E11RageExpences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double monitorPrice = Double.parseDouble(scanner.nextLine());

        int countHeadset = lostGames / 2;
        int countMouse = lostGames / 3;
        int countKeyboard = lostGames / 6;
        int countMonitor = lostGames / 12;

        double totalCost = (countHeadset * headsetPrice)
                + (countMouse * mousePrice)
                + (countKeyboard * keyboardPrice)
                + (countMonitor * monitorPrice);
        System.out.printf("Rage expenses: %.2f lv.", totalCost);
    }
}
