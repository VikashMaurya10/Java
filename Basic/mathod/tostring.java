package Basic.mathod;

public class tostring {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        System.out.println(car.toString());
    }
}

class Car {

    String modal = "ford";
    String name = "XUV 500";
    String color = "Black";
    int year = 2021;

    public String toString() {
        return modal + "\n" + name + "\n" + color + "\n" + year;
    }
}
