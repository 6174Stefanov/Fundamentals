package E2DataTypes;

import java.util.Scanner;

public class E10Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());

        int counter1 = 0;
        int constantN = N;
        while (N >= M) {
            N = N - M;
            counter1++;
            if (N == constantN / 2) {
                if (Y != 0) {
                    N = N / Y;
                }
            }
        }

        System.out.println(N);
        System.out.println(counter1);
    }
}
