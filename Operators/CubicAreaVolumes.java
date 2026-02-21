import java.util.Scanner;

public class CubicAreaVolumes {
   public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter length: ");
            double length = input.nextDouble();

            System.out.print("Enter breadth: ");
            double breadth = input.nextDouble();

            System.out.print("Enter height: ");
            double height = input.nextDouble();

            // Volume of cuboid
            double volume = length * breadth * height;

            // Total surface area of cuboid
            double surfaceArea = 2 * (length * breadth + length * height + breadth * height);

            System.out.println("\nVolume = " + volume);
            System.out.println("Total Surface Area = " + surfaceArea);
        }
    }
}