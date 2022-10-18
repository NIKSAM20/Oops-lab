/*4)	Write a program to find the sum of all integers greater than 40 and less than 250 that are divisible by 5. */

import java.util.*;
public class Demo3_4 {
    
    int sum(){
        int su=0;
        for (int i=41; i<250; i++){
            if(i%5==0){
                su=su+i;
            }
        }
        return su;
    }
    public static void main(String args[]){
 
  Scanner sc= new Scanner(System.in);
       
  Demo3_4 s1= new Demo3_4();
        System.out.println("Sum of the integer= "+s1.sum());
    }    
}