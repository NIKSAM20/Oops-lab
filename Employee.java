import java.util.*;
public class Employee {
    String name;
    String jobstat;
    float basicsal;

    public float gross(float bs, float hra, float da, float ta, float sa){
        return bs+hra+da+ta+sa;
    }

    public float gross(float bs, float ta){
        return bs+ta;
    }

    public float incometax(float gs){
        float x;
        if(gs>100000){
            x=(float) (0.3*gs);
        }
        if(gs>50000 && gs<100000){
            x=(float) (0.1*gs);
        }
        else{
            x=0;
        }
        return x;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        float gs;
        

        Employee a1= new Employee();

        System.out.print("Enter the Name of Employee: ");
        a1.name=sc.next();

        System.out.print("Enter the Basic Salary of Employee: ");
        a1.basicsal=sc.nextInt();
        
        System.out.print("Enter the Jobstat of Employee: ");
        a1.jobstat=sc.next();


        if(a1.jobstat=="permanent"){
            gs=a1.gross(bs, hra, da, ta, sa); }

        else{
            gs=a1.gross(bs, ta); }
            
            
    }





    
}