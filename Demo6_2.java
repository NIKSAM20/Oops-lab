package Balance;
import java.util.*;

public class Account {
    public void Display_Balance(double bal) {
        
        System.out.println("The balance is: "+bal);
    }
}

package Balance;

public class Demo6_2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the balance: ");
        double bal=sc.nextDouble();
        
        Account a= new Account();
        
        a.Display_Balance(bal);
    }
}
