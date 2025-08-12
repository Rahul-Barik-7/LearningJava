package typecastingInJava;

class Parent{
	String name ="Manoj";
	
	void m1()
	{
		System.out.println("this is m1 from parent");
	}
}

class Child extends Parent{
	int id=101;
	
	void m2()
	{
		System.out.println("this is m2 from child");
	}
}
public class TypeCastingObjects1 {
	
	public static void main(String[] args) {
		
//		ex1---------->		
//		Child c=new Child();
//		System.out.println(c.id);
//		System.out.println(c.name);
//		c.m1();
//		c.m2();
		
//		ex2---------->		
//		Parent p=new Child(); //up-casting , here child is smaller and parent is larger because child is extended from Parent
							  // creating the object of child class and storing inside parent class reference
//		System.out.println(p.name);
//		p.m1();
//		System.out.println(p.id); //id cannot be resolved or is not a field
//		p.m2(); //The method m2() is undefined for the type Parent
		
//		ex3---------->		 not possible
//		Parent p1 =new Parent(); 
//		Child c=(Child) p1; //down-casting , // creating the object of parent class and storing inside child class reference
//		System.out.println(c.id);
//		System.out.println(c.name);
//		c.m1();
//		c.m2();
	}
}
