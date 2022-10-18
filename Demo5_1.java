/* 1)	Write a program to create interface named test. In this interface the member function is square. 
        Implement this interface in arithmetic class. 
        Create one new class called ToTestInt. In this class use the object of arithmetic class. */

import java.util.*;
interface Test{
    int square(int x);
}

class Arithmetic implements Test{
    public int square(int x){
        return x*x;
    }
}

class ToTestInt extends Arithmetic{

}

class Demo5_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();

        ToTestInt a=new ToTestInt();
        int sq= a.square(num);
        System.out.println("The square of the number is: "+sq);
    }
}