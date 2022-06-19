package Basic.extand;

import java.util.Scanner;

class Input {
    int input() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        return n;
    }
}

class A {
    void display() {
        System.out.println("Vikash");
        Input in = new Input();

        System.out.println("Enter first input: ");
        System.out.println(in.input());

        System.out.println("Enter second input: ");
        System.out.println(in.input());

    }
}

class B extends A {
    String dis() {
        return ("Maurya");
    }
}

class extand {
    public static void main(String args[]) {
        // A a = new A();
        // a.display();

        B b = new B();
        System.out.println(b.dis());
        b.display();

    }
}