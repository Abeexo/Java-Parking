import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parking p = new Parking("Sample Parking");

        System.out.println("How many license plates do you want to add to the whitelist?");
        int list = getValidInput(scanner);

        for (int i = 0; i < list; i++) {
            System.out.println("Enter a license plate to add to the whitelist:");
            String plate = scanner.next();
            p.addPlateToWhitelist(plate);
        }

        System.out.println("Whitelisted plates: " + p.getWhitelistedPlates());

        boolean continueOperation = true;
        while (continueOperation) {
            System.out.println("\nDo you want to allow a car to enter (Y) or exit (N) or quit (Q)?");
            String input = scanner.next().toUpperCase();

            switch (input) {
                case "Y":
                    System.out.println("Enter the license plate of the car to allow entry:");
                    String newPlate = scanner.next();
                    p.addCar(newPlate);
                    break;
                case "N":
                    System.out.println("Enter the license plate of the car to allow exit:");
                    String exitPlate = scanner.next();
                    p.removeCarAt(exitPlate);
                    break;
                case "Q":
                    System.out.println("Exiting the system. Current parking status: " + p.getParkingStatus());
                    continueOperation = false;
                    break;
                default:
                    System.out.println("Invalid input. Please enter Y to allow entry, N to allow exit, or Q to quit.");
                    break;
            }
        }
    }

    // Helper method to ensure valid integer input
    private static int getValidInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number:");
            scanner.next(); // Clear the invalid input
        }
        return scanner.nextInt();
    }
}