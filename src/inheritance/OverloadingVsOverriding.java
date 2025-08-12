package inheritance;

class ABC
{
	
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	@Override
	void m1(int a)
	{
		System.out.println(a*a); //overriding
	}
	
	void m2(int a, int b)
	{
		System.out.println(a+b);
	}
}

public class OverloadingVsOverriding {
	public static void main(String[] args) {
		
		XYZ x=new XYZ();
		x.m1(10);
		x.m2(20);
		x.m2(30, 40);
	}
}
