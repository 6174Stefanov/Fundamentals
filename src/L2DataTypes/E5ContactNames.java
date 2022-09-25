package L2DataTypes;

import java.util.Scanner;

public class E5ContactNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();

        String symbol = scanner.nextLine();

        if (symbol.length() <=1) {

        System.out.printf("%s%s%s", firstName, symbol.charAt(0), secondName);
    } else if (symbol.length() <=2){
            System.out.printf("%s%s%s%s", firstName, symbol.charAt(0), symbol.charAt(1), secondName);
        } else {
            System.out.printf("%s%s%s%s%s", firstName, symbol.charAt(0), symbol.charAt(1), symbol.charAt(2), secondName);
        }
    }
}
