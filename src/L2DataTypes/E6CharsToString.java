package L2DataTypes;

import java.util.Scanner;

public class E6CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String one = scanner.nextLine();
        String two = scanner.nextLine();
        String three = scanner.nextLine();

        String result = (one + two + three);

        System.out.println(result);
    }
}
