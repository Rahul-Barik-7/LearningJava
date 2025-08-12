package dataAbstractionAndInterfaces;

public class Child1 extends ParentClass implements Interface1,Interface2{
	@Override
	public void m1()
	{
		//System.out.println(x);
	}
	
	@Override
	public void m2() {
		
		System.out.println(y);
	}
	
	public static void main(String[] args) 
	{
		Child1 c= new Child1();
		c.m1();
		c.m2();
		c.m3();
	}
}
