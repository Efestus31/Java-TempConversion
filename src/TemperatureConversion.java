
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        //TEMPERATURE CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);
        //declare variables
        double temp;
        double newTemp;
        String unit;

        System.out.println("TEMPERATURE CONVERSION PROGRAM");
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        //user input
        System.out.print("convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9/5) + 32;

        System.out.printf("%.1f%s°", newTemp, unit);

        scanner.close();
    }
}
