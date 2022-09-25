package L2DataTypes;

import java.util.Scanner;

public class E12Refactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNum = 0;
        boolean isItSpecial = false;
        for (int i = 1; i <= num; i++) {
            currentNum = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            isItSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isItSpecial) {
                System.out.printf("%d -> True%n", currentNum);
            } else {
                System.out.printf("%d -> False%n", currentNum);
            }
            sum = 0;
            i = currentNum;
        }

    }
}
