package inheritance;


class Parent
{
	void display(String name)
	{
		System.out.println(name);
	}
}

class Child1 extends Parent
{
	void show(int roll)
	{
		System.out.println(roll);
	}
}
class Child2 extends Parent
{
	void print(char sec)
	{
		System.out.println(sec);
	}
}

public class HierarchyInheritance {
	
	public static void main(String[] args) {
			
		Child1 c1=new Child1();
		c1.display("Siddharth");
		c1.show(101);
		
		Child2 c2=new Child2();
		c2.display("Siddharth");
		c2.print('c');
	}
}
