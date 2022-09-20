package E1BasicsRewindEx;

import java.util.Scanner;

public class E8TriangleOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

                for (int row = 1; row <= n ; row++) {
                    //колко пъти да печатам нещо
                    for (int times = 1; times <= row ; times++) {
                        System.out.print(row + " ");
                    }
                    System.out.println();

                }
            }
        }
