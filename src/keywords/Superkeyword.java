package keywords;


class Parent
{
	String name="siddharth";
	
	void dog()
	{
		System.out.println("hi.....");
	}
}

class Child extends Parent
{	
	String name="Manoj";
	void m1()
	{
		
		System.out.println(super.name);
	}
	void dog()
	{
		super.dog();
	}
}

public class Superkeyword {
	
	public static void main(String[] args) {
		
		Child c=new Child();
		c.m1();
		c.dog();
	}
}
