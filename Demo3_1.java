/*  1)	Write a program to accept three digits (i.e. 0 - 9) and print all its possible combinations.  
(For example if the three digits are 1, 2, 3 than all possible combinations are : 123, 132, 213, 231, 312, 321.)   */
 

import java.util.*;
class Demo3_1 {

    void combo(int arr[], int combos[]){
        int x=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(i!=j && j!=k && k!=i){
                        int comb=(arr[i]*10+arr[j])*10+arr[k];
                        int flag=0;
                        for(int l=0;l<6;l++){
                            if(combos[l]==comb){
                                flag=1;
                            }
                        }
                        if(flag==0){
                            combos[x++]=comb;
                        }
                    }
                }
            }
        }        
        for(int i=0;i<combos.length;i++){
            if(combos[i]==0){
                break;
            }
            System.out.println(combos[i]);
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        int combos[] = new int[6];
        System.out.println("Enter 3 Numbers: ");
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        Demo3_1 d=new Demo3_1();
        d.combo(arr,combos);
    }
}