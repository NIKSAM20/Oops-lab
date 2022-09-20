class Vehicle{
    String brand="Ford";

    void horn(){
        System.out.println("Peep peep");
    }
}

class Car extends Vehicle{
    String name= "Mustang";
}
public class DasAuto {
    public static void main(String args[]){

        Car c1= new Car();
        
        System.out.print(c1.brand+" "+c1.name+" "+"horns like ");
        c1.horn();
    }
    
}
