/*      Write a java program to throw an exception  for an employee details. 
        If an employee name is a number, a name exception must be thrown.
        If an employee age is greater than 50, an age exception must be thrown. 
	    Or else an object must be created for the entered employee details */	

import java.util.*; 

class Employee{
    String name;
    int age;

    Employee(){
        this.name= name;
        this.age=age;
    }

    public void printDetails(String name, int age){
        System.out.println("Name of employee is: "+name);
        System.out.println("Age of the employee is: "+age);
    }
}

public class Demo7_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name: ");
        String name= sc.next();
        System.out.println("Enter employee age: ");
        int age= sc.nextInt();
       
    }
}