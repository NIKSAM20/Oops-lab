class Worker{
    String name;
    int salRate;

    void ComPay(int hours){
        int rate=this.salRate;
        System.out.println((rate*hours));
    }
}

class DailyWorker extends Worker{
    void ComPay(int hours){
        System.out.println(this.name);
        int rate=this.salRate;
        System.out.println((rate*hours));
    }
}

class SalariedWroker extends Worker{
    void ComPay(){
        System.out.println(this.name);
        int rate=this.salRate;
        System.out.println((rate*40));
    }
}

public class Demo4_3 {
    public static void main(String args[]){

        DailyWorker d=new DailyWorker();
        d.name="Mukesh";
        d.salRate=500;
        d.ComPay(40);

        SalariedWroker s= new SalariedWroker();
        s.name="Sukesh";
        s.salRate=700;
        s.ComPay();
    }
}