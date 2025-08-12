package dataAbstractionAndInterfaces;

public interface Shape {
	
	int length=10; //final and static 
	int width=20; //final and static 
	
	void circle(); //abstract method
	
	default void sqr()
	{
		System.out.println("This is sqr..."); //default method
	}
	
	static void rectangle()
	{
		System.out.println("This is rect..."); //static method
	}
	
}
