package My_Cal_Pkg;

public class Calculator {
    public int addition(int x, int y) {
        return x+y;
    }
    
    public int Subtraction(int x, int y) {
        return x-y;
    }
    
    public int Multiplication(int x, int y) {
        return x*y;
    }
    
    public int Division(int x, int y) {
        return x/y;
    }
}


package My_Cal_Pkg;
import java.util.*;

public class Main_Calculator {
    public static void main(String args[]) {
        
        Scanner sc= new Scanner(System.in);
        Calculator cal=new Calculator();
        
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter first number: ");
        int b=sc.nextInt();
        
        int sum=cal.addition(a, b);
        System.out.println("Sum of numbers is "+sum);
        
        int sub=cal.Subtraction(a, b);
        System.out.println("Subtraction of numbers is "+sub);
        
        int mul=cal.Multiplication(a, b);
        System.out.println("Multilpication of numbers is "+mul);
        
        int div=cal.Division(a, b);
        System.out.println("Division of numbers is "+div);
        
        sc.close();
    }
}
