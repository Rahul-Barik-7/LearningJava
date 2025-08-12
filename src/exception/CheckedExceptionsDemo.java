package exception;

public class CheckedExceptionsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program started");
		System.out.println("Program In progress");
//		try {
//			
//			Thread.sleep(5000);
//		}
//		catch(InterruptedException e)
//		{
//			
//		}
		
		Thread.sleep(2000);
		
		System.out.println("Program Finished");
		System.out.println("Program Exited");
	}
}
