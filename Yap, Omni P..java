import java.util.Scanner;

public class JavaClass {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
		System.out.print("Please Enter the Shape: ");
		String input = scanner.next();

		if("rectangle".equalsIgnoreCase(input)) {
		    System.out.println("Enter the length of rectangle: ");
		    double L = scanner.nextDouble();
		    System.out.println("Enter the weidth of rectangle: ");
		    double W = scanner.nextDouble();

		    double A = L * W;
		    double P = 2 * (L + W);
		    System.out.println("The area of square is: " + A);
		    System.out.println("The area of rectangle is: " + P); 
		}

		if ("circle".equalsIgnoreCase(input)){
		    System.out.println("Enter the radius: ");

		    double radius = scanner.nextDouble();
		    double area = Math.PI * (radius * radius);
		    System.out.println("The area of circle is: " + area);
		    double circumference = Math.PI * 2 * radius;
		    System.out.println("The circumference of the circle is: " +circumference);
		}

        if ("Cylinder".equalsIgnoreCase(input)) {
            System.out.println("Enter the radius of the cylinder: ");
            double radiusCylinder = scanner.nextDouble();
            double radiusCylinder_Squared = radiusCylinder * radiusCylinder;

            System.out.println("Enter the height of the cylinder: ");
            double heightCylinder = scanner.nextDouble();

            double v = Math.PI * radiusCylinder_Squared * heightCylinder;
            double a = (2 * Math.PI * radiusCylinder * heightCylinder + 2 * Math.PI * radiusCylinder_Squared);
            System.out.println("The volume of the cylinder is: " + v);
            System.out.println("The surface area of the cylinder is: " + a);

        }

	}

    }
}
    
