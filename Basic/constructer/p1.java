package Basic.constructer;

public class p1 {
    public static void main(String[] args) {
        Human human1 = new Human("Vikash", 65, 70);
        Human human2 = new Human("Vishal", 29, 90);
        System.out.println(human2.name);
        System.out.println(human1.age);
        human1.eating();
        human2.drink();

    }
}

class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eating() {
        System.out.println(this.name + " is eating");
    }

    void drink() {
        System.out.println(this.name + " is *drinking*");
    }

}