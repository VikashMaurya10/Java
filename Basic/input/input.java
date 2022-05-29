package Basic.input;

import java.util.Scanner;
class fact{
    int i = 1, fact=1;
    void display(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input: ");
        int n = scan.nextInt();
        System.out.println("input: "+n);
        while(i<=n){
            fact = i*fact;
            i++;
        }
        System.out.println("factorial is: "+fact);
    }
}
class input{
    public static void main(String args[]){
        fact p = new fact();
        p.display();
    }
}