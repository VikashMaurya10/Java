package Basic.valume;

public class abc {
  public static void main(String args[]) {

    Box box1 = new Box();
    Box box2 = new Box();
    // Assign the value for box1.
    box1.w = 10;
    box1.h = 20;
    box1.l = 15;
    // Assign the value for box2.
    box2.w = 3;
    box2.h = 6;
    box2.l = 9;
    // Display the valume of box 1
    box1.valum();
    // Display the valume of box 2
    box2.valum();
  }

  class Box {
    double w, h, l;
    void valum() {
      System.out.println("Valume is: " + w * h * l);
    }
  }
}
