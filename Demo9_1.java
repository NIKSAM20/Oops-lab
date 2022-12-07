class Demo extends Thread{ 
    public void run(){
        for(int i=0;i<10;i++){ 
            System.out.println("MultiThreading!");
        }
    }
    public static void main(String[] args) { 
        Demo q1 = new Demo(); 
        q1.start();
    }
}
class Demo9_1 implements Runnable { 
    public void run(){
        for(int i=0;i<10;i++){ 
            System.out.println("MultiThreading!");
        }
    }
    public static void main(String[] args) { 
        Demo9_1 q1b = new Demo9_1(); 
        Thread t1 = new Thread(q1b); 
        t1.start();
    }
}
    