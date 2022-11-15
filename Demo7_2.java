/* Write a Java program to enable the user to handle any chance of divide by zero exception.*/ 

import java.util.*;
public class Demo7_2 {

    public void divide(int x, int y){

        try{
            float q=x/y;
            System.out.println("A divided by b= "+q);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Dividend: ");
        int a=sc.nextInt();
        System.out.print("Enter Divisor: ");
        int b=sc.nextInt();

        Demo7_2 d= new Demo7_2();
        d.divide(a, b);
    }
}