package exception;

public class MultipleCatchBlock {
	
	public static void main(String[] args) {
		System.out.println("program is started....");
		String s=null;
		try
		{
			System.out.println(s.length());			
		}
//		catch(ArithmeticException e1)
//		{
//			System.err.println("Handled Exception");
//			System.out.println(e1.getMessage());
//		}
//		catch(NumberFormatException e2)
//		{
//			System.err.println("Handled Exception");
//			System.out.println(e2.getMessage());
//		}
//		catch(NullPointerException e3)
//		{
//			System.err.println("Handled Exception");
//			System.out.println(e3.getMessage());
//		}
		catch(Exception e)
		{
			System.err.println("Handled Exception");
			System.out.println(e.getMessage());
		}
		System.out.println("Program finished....");
	}
}
