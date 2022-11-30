class Sync {
    static int i = 0;
    synchronized void print() {
        System.out.println(Thread.currentThread().getName() + " :" + this.i++);
    }
}
class Run extends Thread{
    Sync obj = new Sync();
    public void run(){
        obj.print();
    }
    }
public class Demo9_3 {
    public static void main(String[] args) {
        Run[] threadarr = new Run[10];
        for(int i=0;i<threadarr.length;i++){
            threadarr[i] = new Run();
        threadarr[i].start();
        }
    }
}    