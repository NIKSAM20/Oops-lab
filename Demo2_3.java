//   3)	Write a program using classes and object in java.

class employee{
    int id;
    String name;
    
    public employee(){
        id=45;
        name="Nikhil Singh";
    }
    public void setname(String n){ name=n; }
    public String getname(){ return name; }
    public void setid(int i){ id=i; }
    public int getid(){ return id; }
}
    public class Demo2_3 {
    public static void main(String args[]){
        
    employee nikhil= new employee();
    System.out.println(nikhil.getid());
    System.out.println(nikhil.getname());
    }   
}