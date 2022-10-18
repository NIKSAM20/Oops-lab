/* 4)	Write a program to create an Interface having two methods division and modules. 
        Create a class, which overrides these methods. */

class Demo5_4{
    public static void main(String args[]){
        Compute c =  new Compute();
        c.division(20,3);
        c.modules(20,3);
        c.division(30,8);
        c.modules(40,7);
    }
}
interface Number{
    void division(int a,float b);
    void modules(int a,float b);
}
class Compute implements Number{
    public void division(int a,float b) {
        float div=a/b;
        System.out.println("");
        System.out.println("Division (Quotient) of "+a+" and "+b+" : "+div);
    }
    public void modules(int a,float b){
        float mod=a%b;
        System.out.println("Modules (Remainder) of "+a+" and "+b+" : "+mod);
    }
}