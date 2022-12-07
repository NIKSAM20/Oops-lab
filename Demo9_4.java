public class Demo9_4 extends Thread{
    public void run(){ 
        for(int i=0;i<5;i++){
        System.out.println(Thread.currentThread()+" is Running!");
        }
    }
    public static void main(String[] args){ 
        Demo9_4 t1 = new Demo9_4(); 
        Demo9_4 t2 = new Demo9_4(); 
        Demo9_4 t3 = new Demo9_4(); 
        Demo9_4 t4 = new Demo9_4(); 
        Demo9_4 t5 = new Demo9_4();
    
        t1.setPriority(MAX_PRIORITY); 
        t1.setPriority(7); 
        t1.setPriority(NORM_PRIORITY); 
        t1.setPriority(3); 
        t1.setPriority(MIN_PRIORITY);
    
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    
        try{
            t1.sleep(1000); 
            t2.sleep(1500);
        }
        catch(Exception e){ 
            System.out.println(e);
        }
    
        if(t1.isAlive())
            System.out.println("T1 Alive"); 
        if(t2.isAlive()) 
            System.out.println("T2 Alive"); 
        if(t3.isAlive()) 
                System.out.println("T3 Alive"); 
        if(t4.isAlive()) 
            System.out.println("T4 Alive"); 
        if(t5.isAlive()) 
            System.out.println("T5 Alive");
    }
}