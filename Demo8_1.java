import java.util.*; 

public class Demo8_1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str=sc.next();
        System.out.print("Enter the character to find: ");
        char ch=sc.next().charAt(0);

        for(int i=0; i<str.length(); i++){
            char currChar=str.charAt(i);
            if(currChar==ch){
                System.out.println("First occurance of character found at "+i);
                break;
            }
        }

        for(int i=str.length()-1; i>=0; i--){
            char currChar=str.charAt(i);
            if(currChar==ch){
                System.out.println("Last occurance of character found at "+i);
                break;
            }
        }
    }
}
