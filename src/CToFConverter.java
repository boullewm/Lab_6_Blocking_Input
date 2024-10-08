import java.util.Scanner;
public class CToFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double degreesCelsius = 0.0;
        boolean validInput=false;
        do {
            System.out.print("Enter a temperature in Celsius: ");
            if (in.hasNextDouble()) {
                degreesCelsius = in.nextDouble();
                in.nextLine();
                validInput = true;
            } else {
                System.out.println("You have not entered a valid temperature.");
                in.nextLine();
            }
        } while (!validInput);
        double degreesFahrenheit = (degreesCelsius * 9 / 5) + 32;
        System.out.println("The equivalent temperature in Fahrenheit is: " + degreesFahrenheit);
    }
}