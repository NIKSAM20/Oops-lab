/* 3)	Write a class Worker and derive classes DailyWorker and SalariedWorker from it. 
        Every worker has a name and a salary rate. Write method ComPay (int hours) to compute the week pay of every worker. 
        A Daily Worker is paid on the basis of the number of days he/she works. 
        The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are. 
        Test this program to calculate the pay of workers. 
        You are expected to use the concept of polymorphism to write this program. */

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
        
        System.out.println(name+" is a Daily Worker.");
        System.out.println(days*rate);
    }
}

class SalariedWorker extends Worker{

    SalariedWorker(String n, int r){
        name=n;
        rate=r;
    }

    public void Compay(int hours){
        
        System.out.println(name+" is a Salaried Worker.");
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