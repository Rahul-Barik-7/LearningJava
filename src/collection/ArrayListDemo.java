package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList myList=new ArrayList();
	   //List<Integer> li=new ArrayList<Integer>();
		
		
		//adding data into array list
		myList.add(100);
		myList.add(true);
		myList.add('c');
		myList.add("Rahul");
		myList.add(100);
		myList.add(null);
		myList.add(10.5);
		
		System.out.println("size of the array list is : "+myList.size());
		System.out.println("My array lists are : "+myList);
		//4 is the index of the element
		myList.remove(4); 
		System.out.println("My array lists after removeing index 4 : "+myList);
		myList.add('A');
		//adding value middle of the index
		myList.add(2,"Siddharth");
		System.out.println("My array lists after removeing index 4 : "+myList);
		//modification, replace, change
		myList.set(2,"Manoj" );
		System.out.println("Modified lists : "+myList);
		
		//access specific element
		System.out.println("accessing particular element: "+myList.get(2)); //get will accept index
		
		//reading all the values individually from the array list
		//approach-1 (using for loop)
		for(int i=0;i<myList.size();i++)
		{
			System.out.println(myList.get(i));
		}
		
		
		//approach-2 (using for-each loop)
		for(Object x:myList)
		{
			System.err.println(x);
		}
		
		//approach-2 (using iterator)
		
		Iterator it = myList.iterator();
		System.out.println(it.next());
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//checking array list is empty or not 
		
		System.out.println("is array list empty ? "+myList.isEmpty());
		
		//remove all the data from array list
		
		//myList.clear();
		
		System.out.println("****************************************");
		//to remove multiple data 1st we have to create a new array list and then we have to add new list which you want to remove
		//remove accept one parameter
		//removing multiple data randomly
		ArrayList mylist2=new ArrayList();
		mylist2.add(null);
		mylist2.add("Rahul");
		myList.removeAll(mylist2);
		System.err.println(myList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
