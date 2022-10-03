package E2DataTypes;

import java.util.Scanner;

public class E9Dune {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingSpice = Integer.parseInt(scanner.nextLine());
        int currentSpiceLeft = startingSpice;

        int spiceSum = 0;
        int daysCounter = 0;
        int producedDayly = 0;
        while (currentSpiceLeft >= 100){

            producedDayly = currentSpiceLeft - 26;
            spiceSum = spiceSum + (currentSpiceLeft - 26);
            daysCounter++;
            currentSpiceLeft = currentSpiceLeft - 10;

        }
        int finalSpice = spiceSum - 26;
        System.out.printf("%d%n", daysCounter);
        if (spiceSum >= 26) {
            spiceSum -= 26;
        }
        System.out.printf("%d",finalSpice);
    }
}
