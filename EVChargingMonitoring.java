import java.util.Scanner;

public class EVChargingMonitoring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("EV Charging Station Monitoring System");
        System.out.println("------------------------------------");

        System.out.print("Enter Voltage (V): ");
        double voltage = sc.nextDouble();

        System.out.print("Enter Current (A): ");
        double current = sc.nextDouble();

        double power = voltage * current;

        System.out.println("\nCharging Details");
        System.out.println("----------------");
        System.out.println("Voltage : " + voltage + " V");
        System.out.println("Current : " + current + " A");
        System.out.println("Power   : " + power + " W");

        sc.close();
    }
}