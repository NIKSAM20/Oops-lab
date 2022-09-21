class Employee{
    String name;
    int empid;
    int salary;

    Employee(){
        System.out.println("This is an default constructor being called");
    }

    Employee(String name, int empid, int salary){
       this.name=name;
       this.empid=empid;
       this.salary=salary;
    }
    public void print(){
        System.out.println(name);
        System.out.println(empid);
        System.out.println(salary);
        increaseSalary(salary);
    }

    public static void increaseSalary(int salary){
        float newsal=(float)((0.1*salary)+salary);
        System.out.println("Increased salary of employee is "+newsal);
    }
}

public class Demo4_5 {
    public static void main(String args[]){

        Employee Nikhil= new Employee("Nikhil",500094582,10000);
        Nikhil.print();
    }
}