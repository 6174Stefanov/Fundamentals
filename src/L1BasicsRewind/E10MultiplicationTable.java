package L1BasicsRewind;

import java.util.Scanner;

public class E10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int timesMultiplied = 1;
        while (timesMultiplied <= 10) {
            int product = num * timesMultiplied;
            System.out.printf("%d X %d = %d%n", num, timesMultiplied, product);

            timesMultiplied++;
        }
    }
}
