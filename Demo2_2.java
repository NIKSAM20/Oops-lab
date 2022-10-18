//   2)	Write a program to implement a command line calculator.

public class Demo2_2{
    int cal(int x, int y, String o){

        if(o.equals("+")){
            return x+y;}

        else if(o.equals("-")){
            return x-y;}

        else if(o.equals("*")){
            return x*y;}
        else {
            return x/y;}
    }
        public static void main(String args[]){
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[2]);
        String o= args[1];
        
        Demo2_2 s= new Demo2_2();        
        int ans=s.cal(x,y,o);
        System.out.print("The result is: "+ans);
    }
}