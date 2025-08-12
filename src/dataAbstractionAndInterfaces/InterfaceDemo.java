package dataAbstractionAndInterfaces;

public class InterfaceDemo implements Shape{
	
	int x=100;
	int y=200;
	public void circle()
	{
		System.out.println("abstract Method");
	}
	void tri()
	{
		System.out.println("this is tri ....");
	}
	
	public static void main(String[] args) 
	{
		//Scenario-1
		InterfaceDemo inter=new InterfaceDemo();
		inter.circle();
		inter.sqr();
		inter.tri();
		Shape.rectangle(); //static method can directly access from interface
		System.out.println(Shape.length);
		System.out.println(Shape.width);
		System.out.println(inter.x);
		System.out.println(inter.y);
		
		System.out.println("-----------------------");
		//Scenario-2
		Shape sp=new InterfaceDemo();// we can create object reference for interface but we can not instantiate interface (we can not object for interface)
		sp.circle();
		sp.sqr();
		Shape.rectangle();
	}
}
