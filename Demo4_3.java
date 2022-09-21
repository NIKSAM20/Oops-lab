class Worker{
    String name;
    int rate;
}

class DailyWorker extends Worker{

    DailyWorker(String n, int r){
        name=n;
        rate=r;
    }

    public void Compay(int days){
        
        System.out.println(name);
        System.out.println(days*rate);
    }
}

class SalariedWorker extends Worker{

    SalariedWorker(String n, int r){
        name=n;
        rate=r;
    }

    public void Compay(int hours){
        
        System.out.println(name);
        if(hours<=40){
            System.out.println(hours*rate); 
        }
        else{
            System.out.println(40*rate);
        }
    }
}

public class Demo4_3{
    public static void main(String args[]){

        DailyWorker Shyam= new DailyWorker("Shyam",600);
        Shyam.Compay(5);

        SalariedWorker Shivam= new SalariedWorker("Shivam",200);
        Shivam.Compay(38);
    }
}