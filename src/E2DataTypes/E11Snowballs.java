package E2DataTypes;

import java.util.Scanner;

public class E11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballs = Integer.parseInt(scanner.nextLine());

        double valueMax = 0;
        int snowMax = 0;
        int snowTimeMax = 0;
        int snowballQ = 0;

        for (int i = 1; i <= snowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);
            if (snowballValue > valueMax) {
                valueMax = snowballValue;
                snowMax = snowballSnow;
                snowTimeMax = snowballTime;
                snowballQ = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowMax, snowTimeMax, valueMax, snowballQ);
    }
}
