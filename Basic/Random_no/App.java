package Basic.Random_no;

import java.util.Random;

public class App {

  public static void main(String args[]) {
    Random rand = new Random();
    int a = rand.nextInt();
    int b = rand.nextInt(6); // Random no. b/w 0 and 6.
    double c = rand.nextDouble(); // Random no. b/w 0 and 1.
    boolean d = rand.nextBoolean();

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}
