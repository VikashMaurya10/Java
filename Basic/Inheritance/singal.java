package Basic.Inheritance;

public class singal {
    public static void main(String args[]) {
        dog dog = new dog();
        dog.bark();
        dog.eat();
        Animal animal = new Animal();
        animal.eat();;
    }
}

class Animal {

    void eat() {
        System.out.println("eating....");
    }
}

class dog extends Animal {
    void bark() {
        System.out.println("Bearking..");
    }
}