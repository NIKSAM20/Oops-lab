import java.util.*;
public class Demo8_2 {
   public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) { 
         StringBuffer str = new StringBuffer(); 
         System.out.print("Enter a String: "); 
         str.append(sc.nextLine());
         for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i);
            if (ch >= 97 && ch <= 122) { 
               str.replace(i,i+1,String.valueOf((char)(ch-32)));
            }
         }
         System.out.println(str);
      }
   }
}   