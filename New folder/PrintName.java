import java.util.Scanner;
public class PrintName{
    private static Name getName(){
        String first;
        String last;
        String middle;
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("Enter first Name");
        first = in.nextLine();
        System.out.println("Enter last Name");
        last = in.nextLine();
        System.out.println("Enter middle Name");
        middle = in.nextLine();
        in.close();
        return new Name(frist, last, middle);
    }
    public static void main(String args[]){
        Name myName;
        myName  = getName();

        System.out.println("Name in first-last format is" + myName.getfirstName() + " " + myName.getlastName());
        System.out.println("Name in last-first-middle format is" + myName.getlastName() + " " + myName.getfirstName() + " " + myName.getmiddleName());
    }
}