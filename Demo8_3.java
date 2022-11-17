class Demo8_3{

   public static void main(String args[])
   {
      String str[]=args;

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
   }
}