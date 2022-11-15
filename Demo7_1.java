/*Write a program in Java to display the names and roll numbers of students. Initialize respective array variables for 10 students. 
Handle ArrayIndexOutOfBoundsExeption, so that any such problem doesn’t cause illegal termination of program. */

import java.util.*;

public class Demo7_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int roll[]=new int[10];
        String name[]=new String[10];

        try{
            for(int i=0; i<10; i++){
            roll[i]=i+1;
            }
        
            System.out.println("Enter the names: ");
            for(int i=0; i<10; i++){
                name[i]=sc.next();
            }
            
            System.out.println("Name       Roll_No");
            for(int i=0,j=0; j<10; i++,j++){
                System.out.println(name[i]+"        "+roll[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print(e);
        }

    }
}