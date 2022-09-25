package E2DataTypes;

import java.util.Scanner;

public class E8BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kegsAmount = Integer.parseInt(scanner.nextLine());

        double maxVolume = 0;
        String largestModel = "";
        for (int i = 0; i < kegsAmount; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int h = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * radius*radius * h;
            if (volume > maxVolume) {
                maxVolume = volume;
                largestModel = model;
            }
        }
        System.out.println(largestModel);
    }
}
