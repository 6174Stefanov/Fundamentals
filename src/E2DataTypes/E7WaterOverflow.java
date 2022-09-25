package E2DataTypes;

import java.util.Scanner;

public class E7WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int pours = Integer.parseInt(scanner.nextLine());

        int waterIn = 0;
        int capacityLeft = capacity;
        for (int i = 1; i <= pours; i++) {
            int waterAmount = Integer.parseInt(scanner.nextLine());
            if (capacityLeft >= waterAmount) {
                waterIn = waterIn + waterAmount;
                capacityLeft = capacityLeft - waterAmount;
            } else if (capacityLeft < waterAmount) {
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(waterIn);
    }
}
