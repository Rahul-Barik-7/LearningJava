package demo;

public class Test {
	static int roll=1234;
	int age=23;
	
	public  void m1()
	{
		
		System.out.println(roll);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
		System.out.println(roll);
		Test t=new Test();
		System.out.println(t.age);
		
		t.m1();
		
	}
}
