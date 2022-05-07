public class App {

  public static void main(String[] args) {
    double x = 3.14;
    double y = -10;
    double a = 7;
    double b = 9;
    double min = Math.min(x, y);
    double max = Math.max(x, y);
    double absolute2 = Math.abs(y);
    double absolute1 = Math.abs(x);
    // double sqrt = Math.sqrt(y);
    double sqrt = Math.sqrt(b);
    double round = Math.round(x);
    double ceil = Math.ceil(x);
    double floor = Math.floor(x);

    System.out.println("Minimum value " + x + " and " + y + " is: " + min);
    System.out.println("Maximum value " + x + " and " + y + " is: " + max);
    System.out.println("Absolute value of " + x + " is: " + absolute1);
    System.out.println("Absolute value of " + y + " is: " + absolute2);
    System.out.println("Sqrt value of " + a + " is: " + sqrt);
    System.out.println("Roundof value of " + x + " is: " + round);
    System.out.println("Ceil value of " + x + " is: " + ceil);
    System.out.println("Floor value of " + x + " is: " + floor);
  }
}
