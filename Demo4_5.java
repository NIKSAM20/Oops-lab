/* 5)	Design a class employee of an organization. An employee has a name, empid, and salary. 
        Write the default constructor, a constructor with parameters (name, empid, and salary) and methods to return name and salary. 
        Also write a method increaseSalary that raises the employee’s salary by a certain user specified percentage. 
        Derive a subclass Manager from employee. 
        Add an instance variable named department to the manager class. 
        Supply a test program that uses theses classes and methods.    */

class Employee{
    String name;
    int empid;
    int salary;

    Employee(){
        System.out.println("This is an default constructor being called.");
        System.out.println();
    }

    Employee(String name, int empid, int salary){
       this.name=name;
       this.empid=empid;
       this.salary=salary;
    }
    public void print(){
        System.out.println("Name=        "+name);
        System.out.println("Employee ID= "+empid);
        System.out.println("Salary=      "+salary);
        increaseSalary(salary);
    }

    public static void increaseSalary(int salary){
        float newsal=(float)((0.1*salary)+salary);
        System.out.println("Increased salary= "+newsal);
    }
}

class Manager extends Employee{
    String department;
    public void printDept(){
        System.out.println("Department= Manager");
    }
}

public class Demo4_5 {
    public static void main(String args[]){

        Employee Nikhil= new Employee("Nikhil",500094582,10000);
        Nikhil.print();
        Manager m=new Manager();
        m.printDept();

        Employee Shiv=new Employee("Shiv",500094506,12000);
        Shiv.print();
    }
}