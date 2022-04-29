class sum{
    static int a,b,c;
    static void display(){
        a=10;
        b=20;
        c=a+b;
        System.out.println("c="+c);
    }
}
class static_sum{
    public static void main(String args[]){
       sum p= new sum();
       p.display(); // By wusing object.
       sum.display(); //by using static keyword.
    }
}