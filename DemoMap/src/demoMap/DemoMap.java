package demoMap;
import java.util.*;
import java.util.Iterator;
import java.util.Set;
//import java.util.Map;
public class DemoMap 
{

	public static void main(String[] args) 
	{
		{
		HashMap<String, Integer> contacts = new HashMap<>();
		contacts.put("User1", 10000023);
		contacts.put("User2", 20000026);
		contacts.put("User3", 30000022);
		contacts.put("User4", 40000028);
		contacts.put("User5", 50000029);
		
		System.out.println(contacts);
		
		Set<String> keys = contacts.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) 
		{
			String key =it.next();
			System.out.println(key + ":" + contacts.get(key));
		}
		}
	HashMap<Integer,String> hm=new HashMap<>();      
    hm.put(1,"Tim");    
    hm.put(2,"Mary");    
    hm.put(3,"Catie");   
     
    System.out.println("\nThe elements of Hashmap are ");  
    for(Map.Entry m:hm.entrySet())
    {    
     System.out.println(m.getKey()+" "+m.getValue());    
    }
    
   //HashTable
     
    Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
    
    ht.put(4,"Ales");  
    ht.put(5,"Rosy");  
    ht.put(6,"Jack");  
    ht.put(7,"John");  
    ht.put(7,"John"); //duplicate values 

    System.out.println("\nThe elements of HashTable are ");  
    for(Map.Entry n:ht.entrySet())
    {    
     System.out.println(n.getKey()+" "+n.getValue());    
    }
    
    
    //TreeMap
    
    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
    map.put(8,"Annie");    
    map.put(9,"Carlotte");    
    map.put(10,"Catie");       
    map.put(9,"Carlotte");  //duplicate value  
    
    System.out.println("\nThe elements of TreeMap are ");  
    for(Map.Entry l:map.entrySet())
    {    
     System.out.println(l.getKey()+" "+l.getValue());    
    }    
    
 }  

}

