import java.util.*;

public class Demo9_6
{
  public void compute ()  {
    
    HashMap < Integer, String > map = new HashMap <> ();
    map.put (1, "Java");
    
map.put (2, "Cpp");    
map.put (3, "Python");    
map.put (4, "Rust");
    map.put (5, "JavaScript");
    map.put (6, "HTML CSS");
      
System.out.println (map);     
System.out.println ("\nFinding whether 2 exists in the map: " +
			   map.containsKey (2));
    
System.out.println ("\nFinding whether 7 exists in the map: " +
			 map.containsKey (7));    
 
System.out.println ("\nFinding whether Rust exists in the map: " +
			   map.containsValue ("Rust"));
    
System.out.println ("\nFinding whether Dart exists in the map: " +
			 map.containsValue ("Dart")); 
 
System.out.println ("\nThe keys of the map : ");
    Set < Integer > keys = map.keySet ();
  
for (Integer key:keys)
      {
	System.out.print (key + " ");
      
}
    
System.out.println ();
    
System.out.println ("\nThe values of the map :");
    Collection < String > values = map.values ();
  for (String value:values)
      {
	
System.out.print (value + " ");      
}
System.out.println ();

System.out.println ("\nThe key-value pairs as Entry Objects :");
    Set < Map.Entry < Integer, String >> entries = map.entrySet ();
  
for (Map.Entry < Integer, String > ent:entries)
      {
	System.out.println (ent.getKey () + " ==> " + ent.getValue ());
}
System.out.println (); 
}
public static void main (String[]args)
  {
    Demo9_6 obx = new Demo9_6();
    obx.compute ();
} 
} 