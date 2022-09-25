package E2DataTypes;

import java.util.Scanner;

public class E2SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sumNumbs = 0;
        int i = num;
        while (i > 0) {
            int currentNum = i % 10;

            sumNumbs = sumNumbs + currentNum;
            i = i / 10;
        }
        System.out.println(sumNumbs);
    }
}
