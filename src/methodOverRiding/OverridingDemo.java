package methodOverRiding;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b=new Bank();
		double b1 = b.roi();
		System.out.println(b1);
		
		HDFC h=new HDFC();
		double h1 = h.roi();
		System.out.println(h1);
		
		SBI s=new SBI();
		double s1 = s.roi();
		System.out.println(s1);
		
		
	}
	
}
