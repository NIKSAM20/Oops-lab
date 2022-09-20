class Demo1{
    public int a;
    private int b;

    public void printA(int a){
        System.out.println(this.a);
    }

    private void printB(int b){
        System.out.println(this.b);
    }
}

class Demo2 extends Demo1{
    int c;
    public void printC(int c){
        System.out.println(this.c);
    }
}

class Demo4_1{
    public static void main(String args[]){

        Demo1 d1=new Demo1();
        d1.a=10;
        d1.printA(d1.a);

        Demo2 d2=new Demo2();
        d2.a=20;
        d2.printA(d2.a);

        d2.c=30;
        d2.printC(d2.c);
        
        d2.b=40;
        d2.printB(d2.b);
    }
}