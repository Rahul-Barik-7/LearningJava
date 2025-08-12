package collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		
		//declaration
		HashMap<Integer, String> hm1=new HashMap<Integer, String>();
		//HashMap hm=new HashMap();
		//Map hm2=new HashMap();
		
		hm1.put(101, "Rahul");
		hm1.put(101, "Alex"); //duplicate
		hm1.put(103, "Blake");
		hm1.put(104, "Casey");
		hm1.put(105, "Drew");
		
		System.out.println(hm1); //{101=Alex, 103=Blake, 104=Casey, 105=Drew}
		
		//size of hash map
		System.out.println(hm1.size());
		
		//remove pair
		hm1.remove(101);
		System.out.println(hm1);  //{103=Blake, 104=Casey, 105=Drew}
		
		//access the value of the particular key
		System.out.println(hm1.get(104)); //Casey
		
		//get all the keys from HashMap
		System.out.println(hm1.keySet()); //[103, 104, 105]
		
		//get all the values from HashMap
		System.out.println(hm1.values()); //[Blake, Casey, Drew]
		
		//get all the keys and values from HashMap
		System.out.println(hm1.entrySet()); //[103=Blake, 104=Casey, 105=Drew]
		
		//reading data from hash map by using for each loop
		for(int x:hm1.keySet())
		{
			System.out.println(x+"  "+hm1.get(x));
		}
		
		System.out.println("---------------------------------------------");
		//using iterator
		Iterator<Entry<Integer, String>> it = hm1.entrySet().iterator();
		while(it.hasNext())
		{	
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
