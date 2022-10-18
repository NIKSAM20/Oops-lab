/* 2)	Write a program to create interface A, in this interface we have two method meth1 and meth2. 
        Implements this interface in another class named MyClass. */

import java.util.*;
interface A{
    void meth1(int x);
    void meth2(int y);
}

class MyClass implements A{
    public void meth1(int x){
        System.out.println("This first method calculate square");
        System.out.println("The square is: "+x*x);
        System.out.println();
    }

    public void meth2(int y){
        int fact=1;
        System.out.println("This second method calculates factorial");
        for(int i=1; i<=y; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of the number is: "+fact);
    }
}

class Demo5_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=sc.nextInt();

        MyClass c=new MyClass();
        c.meth1(a);
        c.meth2(a);
    }    
}
