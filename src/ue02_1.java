//choose max value out of 3 integers
import java.util.Scanner;

public class ue02_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                System.out.print("Enter integer " + (i + 1) + ": ");
                if (input.hasNextInt()) {
                    numbers[i] = input.nextInt();
                    break;
                } else {
                    System.out.println("Invalid, enter a whole number: ");
                    input.next();
                }
            }
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] >= max) {
                max = numbers[i];
            }
        }

        System.out.println("highest value is: " + max);

        input.close();
    }
}
