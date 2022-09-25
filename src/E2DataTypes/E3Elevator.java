package E2DataTypes;

import java.util.Scanner;

public class E3Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double result = (numberOfPeople / (capacity *1.0));

        System.out.printf("%.0f", Math.ceil(result));
    }
}
