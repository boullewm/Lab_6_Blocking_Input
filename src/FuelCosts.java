import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        double numberOfGallons = 0.0;
        double fuelEfficiency = 0.0;
        double pricePerGallon = 0.0;
        double costToDrive;
        double numberOfMiles;
        boolean validNumberInput=false;
        boolean validFuelInput=false;
        boolean validPriceInput=false;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the number of gallons in the tank: ");
            if (in.hasNextDouble()) {
                numberOfGallons = in.nextDouble();
                in.nextLine();
                validNumberInput = true;
            } else {
                System.out.println("You have not entered a valid number.");
                in.nextLine();
            }
        } while (!validNumberInput);
        do {
            System.out.print("Enter the fuel efficiency of your car: ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                validFuelInput = true;
            } else {
                System.out.println("You have not entered a valid number.");
                in.nextLine();
            }
        } while (!validFuelInput);
        do {
            System.out.print("Enter the price per gallon of gas: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                validPriceInput = true;
            } else {
                System.out.println("You have not entered a valid cost.");
                in.nextLine();
            }
        } while (!validPriceInput);
        costToDrive = (100 / fuelEfficiency) * pricePerGallon;
        numberOfMiles = numberOfGallons * fuelEfficiency;
        System.out.printf("The cost to drive 100 miles is: $%.2f%n", costToDrive);
        System.out.printf("The car can go %.2f miles with a full tank of gas.%n", numberOfMiles);
    }
}
