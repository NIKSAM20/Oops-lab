public class Demo9_1 extends Thread{ 
    public void run(){
        for(int i=0;i<10;i++){ 
            System.out.println("MultiThreading!");
        }
    }
    public static void main(String[] args) { 
        Demo9_1 q1 = new Demo9_1(); 
        q1.start();
    }
}
public class Question1b implements Runnable { 
    public void run(){
        for(int i=0;i<10;i++){ 
            System.out.println("MultiThreading!");
        }
    }
    public static void main(String[] args) { 
        Question1b q1b = new Question1b(); 
        Thread t1 = new Thread(q1b); 
        t1.start();
    }
}
    