package E1BasicsRewindEx;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int min = 0;
        int max = 0;
        int average = 0;

        if (a < b ) {
            min = a;
        } else if (a > b){
            min =b;
        }
        if (c < min) {
            min = c;
        }
        if (a > b) {
            max = a;
        } else if (a < b) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (a > min && a < max) {
            average = a;
        } else if (b > min && b < max) {
            average = b;
        } else if (c > min && c < max){
            average = c;
        }
        if (a == b && b == c) {
            min = a;
            average = a;
            max = a;
        }
        System.out.println(max);
        System.out.println(average);
        System.out.println(min);
    }
}
