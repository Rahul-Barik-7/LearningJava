package keywords;




class Test
{
	int x=100;
	 final int y=200;
}

public class FinalKeyword {
	
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.x);
		t.x=250;
		System.out.println(t.x);
		System.out.println(t.y);
		
	}
}
