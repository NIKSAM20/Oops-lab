import java.util.*;
interface Test{
    int square(int x);
}

class Arithmetic implements Test{
    public int square(int x){
        return x*x;
    }
}

class ToTestInt extends Arithmetic{

}

class Demo5_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();

        ToTestInt a=new ToTestInt();
        int sq= a.square(num);
        System.out.println("The square of the number is: "+sq);
    }
}