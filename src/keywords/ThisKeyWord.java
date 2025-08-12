package keywords;

public class ThisKeyWord {
	int x,y;
	
/*	constructor
	ThisKeyWord(int x,int y) {
		this.x=x;
		this.y=y;
	} */
	
	void setData(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	void Run()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		
		//ThisKeyWord ds=new ThisKeyWord(100, 200);
		//ds.Run();
		
		ThisKeyWord th=new ThisKeyWord();
		th.setData(3223, 2132132);
		th.Run();
	}
}
