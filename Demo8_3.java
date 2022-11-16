public class Demo8_3 {
    public static void main(String args[]){
    
        String str[]= args;
        
        for(int a = 0; a < str.length; a++)
      {
         if(str[a] >= 'a' && str[a] <= 'z')
         {
            str[a] = (char)((int)str[a] - 32);
         }
      }
      System.out.println("string in luppercase is: ");
      for(int a = 0; a < str.length; a++)
      { 
         System.out.println(str[a]);
      }
    }
}
