class fact{
    int i = 1, fact=1, count=0;
    void display(){
       while(i<=5){
            fact = i*fact;
            i++;
            count++;
        }
        System.out.println("factorial of 5!: "+fact);
        System.out.print("\tcount="+count);
    }
}
class factorial{
    public static void main(String args[]){
        fact p = new fact();
        p.display();
    }
}