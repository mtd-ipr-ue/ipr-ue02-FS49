//calculates the green area of a square outside a circle
import java.util.Scanner;

public class ue02_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("x: ");
        double x = input.nextDouble();

        System.out.print("y: ");
        double y = input.nextDouble();

        double radius = 4.0;

        boolean greenArea = (x >= 0 && y >= 0 && (x * x + y * y) >= (radius * radius) && x <= 4 && y <=4);

        if (greenArea) {
            System.out.println("coordinates are inside of green area");
        } else {
            System.out.println("coordinates are outside of green area");
        }

        input.close();
    }
}
