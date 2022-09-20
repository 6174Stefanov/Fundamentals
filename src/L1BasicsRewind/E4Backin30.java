package L1BasicsRewind;

import java.util.Scanner;

public class E4Backin30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int mins = Integer.parseInt(scanner.nextLine());

        int allMin = (hours * 60) + mins + 30;

        int inHours = allMin / 60;
        int leftMins = allMin % 60;
        if (inHours >= 24 ) {
            inHours = 0;
        }
        System.out.printf("%d:%02d", inHours, leftMins);
    }
}
