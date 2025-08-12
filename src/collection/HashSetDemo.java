package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		
		//Declaration
		//HashSet<Object> mySet=new HashSet<Object>();
		//Set mySet=new HashSet();
		HashSet mySet=new HashSet();
		
		//adding element into HashSet
		mySet.add(100);
		mySet.add(10.508);
		mySet.add('A');
		mySet.add("Rahul");
		mySet.add("Rahul");
		mySet.add(true);
		mySet.add(null);
		mySet.add(null);
		
		//printing elements
		System.out.println(mySet); //[null, A, Rahul, 10.508, 100, true]
		
		//remove specific values from hash set
		mySet.remove(100); // we have to direct specify the value bcz indexing not allowed
		System.out.println(mySet); //[null, A, Rahul, 10.508, true]
		
		//inserting element - not possible because  hash map not supports indexing
		
		//Accessing specific element from the set collection also not possible but work around is available
		//for that we have to convert HashSet to ArrayList 
		
		ArrayList al=new ArrayList(mySet);
		System.out.println(al); //[null, A, Rahul, 10.508, true]
		System.out.println(al.get(2)); //Rahul
		System.out.println("---------------------------------------------");
		
		//size of HashSet
		System.out.println(mySet.size());
		
		//reading all elements by using for each loop (because normal for loop is not acceptable because indexing not allowed)
		
		for ( Object x:mySet)
		{
			System.out.println(x);
			
		}
		System.out.println("---------------------------------------------");
		
		
		//using iterator
		Iterator it = mySet.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		System.out.println("---------------------------------------------");
		
		mySet.clear();
		System.out.println(mySet);
		System.out.println("---------------------------------------------");
		
		if(mySet.isEmpty())
		{
			System.out.println("Data not present");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
