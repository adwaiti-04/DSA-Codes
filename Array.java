import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalTime;

public class Array {
   
    public static void printCarDetails(String name, ArrayList<String> tyers, ArrayList<String> cc) {
        if (name.equalsIgnoreCase("SUV")) {
            System.out.println(name + " " + tyers.get(0) + ", " + cc.get(0));
        } else if (name.equalsIgnoreCase("AUTO")) {
            System.out.println(name + " " + tyers.get(1) + ", " + cc.get(1));
        } else if (name.equalsIgnoreCase("ACTIVA")) {
            System.out.println(name + " " + tyers.get(2) + ", " + cc.get(2));
        } else {
            System.out.println("data not found");
        }
    }

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        ArrayList<String> cars = new ArrayList<>();
        cars.add("SUV");
        cars.add("AUTO");// hyacinth
        cars.add("ACTIVA");
        System.out.println("cars = " + cars);

        ArrayList<String> tyers = new ArrayList<>();
        tyers.add("FOUR");
        tyers.add("THREE");
        tyers.add("TWO");
        System.out.println("Tyers = " + tyers);

        ArrayList<String> cc = new ArrayList<>();
        cc.add("1200");
        cc.add("500");
        cc.add("300");
        System.out.println("cc = " + cc);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any car name ");
        String name = sc.nextLine();

        printCarDetails(name, tyers, cc);

        System.out.println("Current Local Time: " + time);
        sc.close();
    }
}
