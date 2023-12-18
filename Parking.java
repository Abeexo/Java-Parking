import java.util.ArrayList;
import java.util.Scanner;

class Parking {
    private String name;
    ArrayList<String> parking = new ArrayList<String>();
    ArrayList<String> plate = new ArrayList<String>();

    public Parking(String name) {
        this.name = name;
    }

    public void addPlateToWhitelist(String plate) {
        this.plate.add(plate);
        System.out.println("Plate " + plate + " added to the whitelist.");
    }

    public void addCar(String newplate) {
        if (this.plate.contains(newplate)) {
            this.parking.add(newplate);
            System.out.println("Car with plate " + newplate + " allowed to enter.");
        } else {
            System.out.println("Car with plate " + newplate + " is not in the whitelist. Entry denied.");
        }
    }

    public void removeCarAt(String plate) {
        if (this.parking.contains(plate)) {
            this.parking.remove(plate);
            System.out.println("Car with plate " + plate + " allowed to exit.");
        } else {
            System.out.println("Car with plate " + plate + " is not in the parking lot.");
        }
    }

    public ArrayList<String> getWhitelistedPlates() {
        return this.plate;
    }

    public ArrayList<String> getParkingStatus() {
        return this.parking;
    }
}