import java.util.Scanner;
class Demo8_2{

   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any string to convert to uppercase: ");
      String strInput = sc.nextLine();
      char[] ch = strInput.toCharArray();
      for(int a = 0; a < ch.length; a++)
      {
         if(ch[a] >= 'a' && ch[a] <= 'z')
         {
            ch[a] = (char)((int)ch[a] - 32);
         }
      }
      System.out.println("string in Uppercase is: ");
      for(int a = 0; a < ch.length; a++)
      { 
         System.out.print(ch[a]);
      }
      sc.close();
   }
}