package E3Arrays;

import java.util.Scanner;

public class E2CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");

        for (String elementSecondArray : array2 ) {
            for (String elementFirstArray : array1) {
                if (elementSecondArray.equals(elementFirstArray)) {
                    System.out.print(elementFirstArray + " ");
                }
            }
        }
    }
}
