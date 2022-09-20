package E1BasicsRewindEx;

import java.util.Scanner;

public class E6StrongNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int startNum = num;
        int factSum = 0;

        while (num > 0) {
            int lastNum = num % 10;
            int fact = 1;
            for (int i = 1; i <= lastNum; i++) {
                fact = fact * i;
            }

            factSum += fact;
            num = num / 10;
        }
        if (factSum == startNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
