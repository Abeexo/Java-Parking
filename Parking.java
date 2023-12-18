import java.util.ArrayList;

public class Parking {
    private String name;
    ArrayList<String> parking = new ArrayList<String>();
    ArrayList<String> plate = new ArrayList<String>();

    public Parking(String name) {
        this.name = name;

    }

    public void addCar(String a) {
        if (this.plate.contains(a)) {
            this.parking.add(a);
        } else {
            System.out.println("\nYOU CAN NOT ENTER! the machine is not in the whitelist");
        }
        return;
    }

    public void removeCarAt(String a) {
        if (this.plate.contains(a)) {
            this.parking.remove(a);
        } else {
            System.out.println("\nThe car does not exist in the parking lot");
        }
        return;
    }

    public String toString() {
        String response = this.name + " [";
        for (String a : this.parking) {
            if (this.parking == null) {
                response += "_,";
            } else {
                response += "@,";
            }
        }
        response += "]";
        return response;

    }

}