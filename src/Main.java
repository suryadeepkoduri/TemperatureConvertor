import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double temp;
        
        Scanner scnr = new Scanner(System.in);
        System.out.println("Pick a Conversion:"
        + "\n1.Farenheit to Celsius"
        + "\n2.Celsius to Farenheit"
        + "\n3.Kelvin to Celsius"
        + "\n4.Celsius to Kelvin"
        + "\n5.Farenheit to Kelvin"
        + "\n6.Kelvin to Farenheit");

        System.out.print("Enter the Conversion(Ex:1): ");
        int situation = scnr.nextInt();

        switch(situation) {
            case 1:
                System.out.print("Enter temperature in Farenheit: ");
                temp = scnr.nextDouble();
                System.out.println("\nCelsius:"+TemperatureConvertor.farenheitToCelsius(temp));
                break;
            case 2:
                System.out.print("Enter temperature in Celsius: ");
                temp = scnr.nextDouble();
                System.out.println("\nFarenheit:"+TemperatureConvertor.celsiusToFarenheit(temp));
                break;
            case 3:
                System.out.print("Enter temperature in Kelvin: ");
                temp = scnr.nextDouble();
                System.out.println("\nCelsius:"+TemperatureConvertor.kelvinToCelsius(temp));
                break;
            case 4:
                System.out.print("Enter temperature in Celsius: ");
                temp = scnr.nextDouble();
                System.out.println("\nKelvin:"+TemperatureConvertor.celsiusToKelvin(temp));
                break;
            case 5:
                System.out.print("Enter temperature in Farenheit: ");
                temp = scnr.nextDouble();
                System.out.println("\nKelvin:"+TemperatureConvertor.farenheitToKelvin(temp));
                break;
            case 6:
                System.out.print("Enter temperature in Kelvin ");
                temp = scnr.nextDouble();
                System.out.println("\nFarenheit:"+TemperatureConvertor.kelvinToFarenheit(temp));

        }
    }
}