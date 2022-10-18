/*2)	Write a Java Program to accept 10 numbers in an array and compute the square of each number. 
Print the sum of these numbers. */

import java.util.*;
public class Demo3_2 {
    
    void square(int arr[], int n){
        int sum=0;
        int sqsum=0;
        
        System.out.println("Sqaure of all numbers are: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]*arr[i]+" ");
        }

        System.out.println();
        for(int i=0; i<n; i++){
            sum= sum+arr[i];
        }
        System.out.println("Sum of array elements is: "+sum);

        for(int i=0; i<n; i++){
            sqsum=(arr[i]*arr[i]+sqsum);
        }
        System.out.println("Sum of square of elements is: "+sqsum);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n= sc.nextInt();
        
        int arr[]= new int[n];
        System.out.print("Enter the numbers: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
	  Demo3_2 a1=new Demo3_2(); 	
        a1.square(arr,n);        
    }
}