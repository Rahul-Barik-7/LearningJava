package exceptionHandling.checkedException;
import java.io.FileOutputStream;

public class FileNotFoundException {
	
	
	//error (using throws key word)
	
	/*	public static void main(String[] args)
		{
			
			FileOutputStream fout=new FileOutputStream("D://RAHUL//Java//a.txt");
			System.out.println("Created");
		} */
	
	
	//approach-1 (using throws key word)
	
	/* public static void main(String[] args) throws java.io.FileNotFoundException {
		
		FileOutputStream fout=new FileOutputStream("D://RAHUL//Java//a.txt");
		System.out.println("Created");
	} */
	
	//approach-2 (by handling the exception)
		public static void main(String[] args) {
			try 
			{
				FileOutputStream f=new FileOutputStream("D://RAHUL//Java//b.txt");
				System.out.println("Created");
			} 
			catch (java.io.FileNotFoundException e) {
				
			}
		}

}
