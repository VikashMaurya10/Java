package Basic.keywords;

public class Static {
    public static void main(String[] args) {
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();
        System.out.println(Count.count); // This is called simple Count()
        Count.displayCount(); //this called void fuction
        System.out.println("int -" + Count.displayCount(Count.count)); //This called int function
    }
}

class Count {
    static int count;

    Count() {
        count++;
    }

    static void displayCount() {
        System.out.println("void-Total number is " + count);
    }

    static int displayCount(int Num) {
        return Num;
    }

}