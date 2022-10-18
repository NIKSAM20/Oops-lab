//  1)	Write a program to find the largest of 3 numbers.

import java.util.*;
public class Demo2_1{
    int largest(int x, int y, int z){
	        
        if(x>y && x>z){
            return x;
        }
        else if(y>x && y>z){
            return y;
        }
	    else{
            return z;
        }
    }	
	public static void main(String args[]){
        int ans;
        Demo2_1 s1=new Demo2_1();
	
	    Scanner sc= new Scanner(System.in);
	       
	    System.out.print("Enter first number: ");
	    int m= sc.nextInt();
	
	    System.out.print("Enter first number: ");
	    int n= sc.nextInt();
	
	    System.out.print("Enter third number: ");
	    int o= sc.nextInt();
	      
        ans=s1.largest(m,n,o);
	    System.out.println(ans+" is the largest");       
	    }
	}