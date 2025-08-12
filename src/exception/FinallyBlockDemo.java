package exception;

public class FinallyBlockDemo {
	
	public static void main(String[] args) {
		
		String s="Sid";
		try
		{
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch Block handled Exception...");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Entered into finally block");
		}
		System.out.println("Program finished");
	}
}
 