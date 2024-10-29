//calculates numbers of days of a given month for specific dates
import java.util.Scanner;

public class ue02_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, month;

        System.out.print("Enter year: ");
        year = input.nextInt();
        System.out.print("Enter month: ");
        month = input.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("days = 31");
                break;
            case 4, 6, 9, 11:
                System.out.println("days = 30");
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("days = 29");
                } else {
                    System.out.println("days = 28");
                }
                break;
            default:
                System.out.println("Invalid month");
        }

        input.close();
    }
}
