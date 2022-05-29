package Basic.Hypotenuse;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    double x;
    double y;
    double z;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value of x: ");
    x = scan.nextDouble();
    System.out.println("Enter the value of y: ");
    y = scan.nextDouble();
    z = Math.sqrt(x * x + y * y);
    System.out.println("The Hypotenuse is: " + z);
    scan.close();
  }
}
