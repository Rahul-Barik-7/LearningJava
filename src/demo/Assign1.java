package demo;

public class Assign1 {
	
	 String name; 
	 int number;
	
	public void m1(String name,int number)
	{
		this.name=name;
		this.number=number;
		
		if(number%2==0)
		{
			for(int i=1;i<=number;i++)
			{
				System.out.println(name);
			}
		}
		else {
			for(int i=1;i<=number/2;i++)
			{
				System.out.println(name);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Assign1 a=new Assign1();
		a.m1("Lokesh", 3);
	}
}
