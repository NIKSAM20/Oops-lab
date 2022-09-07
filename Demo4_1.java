class Number{
    private int x;
    float b;

    private void printInteger(){
        System.out.println("The integer is "+this.x);
    }

    void printFloat(){
        System.out.println("The flaot is "+this.y);
    }
}

public interface Demo4_1 {
    public static void main(String argd[]){
        
        Number a=new Number();
        a.x=10;
        a.y=5.4;
        a.printFloat(a.y);
        a.printTnteger(a.x);
    }
}
