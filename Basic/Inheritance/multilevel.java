package Basic.Inheritance;

public class multilevel {
    public static void main(String[] args) {
        System.out.println("This is first Class");
        Animal animal = new Animal();
        animal.eat();
        System.out.println("this is second class");
        Dog dog = new Dog();
        dog.beark();
        dog.eat();
        System.out.println("This is third class");
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.beark(); 
        puppy.play();
       System.out.println(puppy.playTime); 
    }
}

class Animal {
    void eat() {
        System.out.println("Animal are eatting.");
    }
}

class Dog extends Animal {
    void beark() {
        System.out.println("Dogs are bearking.");
    }
}
class Puppy extends Dog{
    int playTime= 10;
    void play(){
        System.out.println("Puppy is playing.");
    }
}
