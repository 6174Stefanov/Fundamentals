package L3Arrays;

import java.util.Scanner;

public class E04ReverseArrayStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String [] inputArr = scanner.nextLine().split(" ");
        for (int i = 0; i < inputArr.length / 2; i++) {
            String constant0 = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = constant0;
        }
        System.out.println(String.join(" ", inputArr));
    }
}
