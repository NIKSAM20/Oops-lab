/* Create an exception class, which throws an exception if operand is nonnumeric in calculating modules. (Use command line arguments).  */

import java.util.*;
class error extends Exception{
    error() {
        super("Error : Element is less than 500\n");
    }
}
public class Demo7_3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter a Number : ");
        num=sc.nextInt();
        try {
            if (num >= 500) {
                System.out.println("Hi! There");
            } else {
                throw new error();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}