import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo9_5
{
  
public void compute ()
  {
    
ArrayList < Integer > list = new ArrayList <> ();
    
 
list.add (1);    
list.add (2);
list.add (3);
list.add (4);
list.add (5);
 
System.out.println ("The list elements are:");
System.out.println (list);
 
Iterator < Integer > iter = list.iterator ();
    
System.out.
      println ("The list elements by using the iterator() instance:");
    
while (iter.hasNext ())
      {
System.out.print (iter.next () + " ");

} 
ArrayList < ? >duplicate = new ArrayList <> ();
    duplicate = (ArrayList < ? >)list.clone ();
    
System.out.
      println ("\nThe duplicate instance of the already created list:");
    
System.out.println (duplicate);

Collections.reverse (duplicate);
    System.out.println ("The reversed ArrayList:");
    
System.out.println (duplicate);  
}
  
public static void main (String[]args)
  {
    Demo9_5 q5 = new Demo9_5 ();
    q5.compute ();

} 
}