import java.util.*; 
class Demo8_4 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        String str= new String();

        System.out.println("Enter the String: ");
        str=sc.next();
        
        System.out.println("Length of the string is: "+str.length());
        
        int ctr=0;

        for(int i=0; i<str.length(); i++){
            
            char currChar= str.charAt(i); 
            if( currChar=='a'){
                System.out.println("'a' found at index"+i);
                ctr++;
            }
        }
        System.out.println("Number of occurance of 'a' is: "+ctr);
    }
}
