import java.util.Scanner;

import static java.lang.Math.sqrt;

public class RectangleInfo {
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        boolean validWidthInput = false;
        boolean validHeightInput = false;
        double area;
        double perimeter;
        double diagonal;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                validWidthInput = true;
            } else {
                System.out.println("You have not entered a valid width.");
                in.nextLine();
            }
        } while (!validWidthInput);
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                validHeightInput = true;
            } else {
                System.out.println("You have not entered a valid height.");
                in.nextLine();
            }
        } while (!validHeightInput);
        area = width*height;
        perimeter = (width + height) * 2;
        diagonal = sqrt(width*width + height*height);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The length of the diagonal of the rectangle is: " + diagonal);
    }
}
