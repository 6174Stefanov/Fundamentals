package E3Arrays;

import java.util.Scanner;

public class E3ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String [] array1 = new String[n];
        String [] array2 = new String[n];

        for (int i = 1; i <= n; i++) {
            String [] numbers = scanner.nextLine().split(" ");
            String num1 = numbers[0];
            String num2 = numbers[1];

            if (i % 2 == 0) {
                array2[i -1] = num1;
                array1[i-1] = num2;
            } else {
                array1[i-1] = num1;
                array2[i -1] = num2;
            }
        }
        System.out.println(String.join(" ", array1));
        System.out.println(String.join(" ", array2));
    }
}
