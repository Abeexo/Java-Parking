import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Parking p = new Parking("boh");
        System.out.println("how plates do you want in whitelist?:");
        int list = s.nextInt();

        for (int i = 0; i < list; i++) {
            System.out.println("Type a whiteplate:");
            p.plate.add(s.next());
        }

        System.out.println(p.plate);

        while (true) {
            System.out.println("\nyou want to let a car in?");
            String Y = s.next();
            if (Y.equals("y")) {
                System.out.println("\nset a plate\n");
                String newplate = s.next();
                p.addCar(newplate);

            } else {
                System.out.println("\nyou want to let a car out?");
                String x = s.next();
                if (x.equals("y")) {
                    System.out.println("\nset a plate\n");
                    String newplate = s.next();
                    p.removeCarAt(newplate);

                } else {
                    System.out.println(p.parking);
                    return;
                }
            }

        }

    }
}