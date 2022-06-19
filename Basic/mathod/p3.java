package Basic.mathod;

public class p3 {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Car car = new Car("BMW");
        garage.parked(car);

    }
}

class Garage {
    void parked(Car myCar) {
        System.out.println("The " + myCar.name + " is parked in the garage.");
    }
}

class Car {
    String name;

    Car(String Name) {
        this.name = Name;
    }
}