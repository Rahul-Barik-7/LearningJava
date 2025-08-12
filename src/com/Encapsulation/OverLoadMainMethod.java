package com.Encapsulation;

public class OverLoadMainMethod {
	
	
	void main()
	{
		System.out.println("hi");
	}
	void main(int x)
	{
		System.err.println(x);
	}
	
	public static void main(String[] args) {
			
		OverLoadMainMethod ov= new OverLoadMainMethod();
		ov.main();
		ov.main(19);
		
	}
}
