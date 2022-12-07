class Even extends Thread{
    public void run(){ 
        for(int i=2;i<=20;i+=2){
            System.out.println("Even: "+i);
        }
    }
}
class Odd extends Thread{
    public void run(){
        for(int i=1;i<=20;i+=2){
            System.out.println("Odd: "+i);
        }
    }
}
public class Demo9_2 {
    public static void main(String[] args) {
        Even e1 = new Even();
        Odd o1 = new Odd();
        e1.start();
        o1.start();
    }
}    