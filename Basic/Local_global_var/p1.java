package Basic.Local_global_var;

import java.util.Random;

public class p1 {

    public static void main(String[] args) {
        Local L = new Local();
        global G = new global();
    }
}

class Local {
    Local() {
        Random random = new Random();
        int Number = 0;
        /*
         * There is rendom & Number are local variable.
         * so we pass the these variable in the function.
         */
        Rand_Number(random, Number);
    }

    void Rand_Number(Random random, int Number) {
        Number = random.nextInt(6) + 1;
        System.out.println("Local number is: " + Number);
    }
}

class global {
    Random random; // These are global varibale
    int Number;

    global() {
        random = new Random();
        Rand_Number();
    }

    void Rand_Number() {
        Number = random.nextInt(6) + 1;
        System.out.println("Global number is: " + Number);
    }

}