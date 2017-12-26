// Floats_If exercise
import java.lang.Math;
import java.util.Scanner;
   
public class Floats_If {

  public static void main(String[] args) {
    double radius  = 2.0;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the radius: ");
    radius = input.nextDouble();

    if (radius > 0) {
      double area = radius * radius * Math.PI;
      System.out.println("\n Area of a circle with radius " + 
      radius + " = " + area);
    }
    else {
      System.out.println("\n Sorry, radius must be greater than 0.0\n");
    }
  }
}

