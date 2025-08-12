package upcastingAndDowncasting;

public class Driver {
	
	public static void main(String[] args) {
		
		Cart c=null;
		c=new Onion();
		System.out.println(c.compName);
		//System.out.println(c.tprice); //down casting  not possible 
		
		
		if(c instanceof Patato)
		{
			Patato p= (Patato)c; //using type cast operator
			System.out.println(p.compName); 
			System.out.println(p.pPrice);
		}
		else if(c instanceof Tamato)
		{
			Tamato t= (Tamato)c; //using type cast operator
			System.out.println(t.compName);
			System.out.println(t.tPrice);
		}
		else if(c instanceof Onion)
		{
			Onion o= (Onion)c; //using type cast operator
			System.out.println(o.compName);
			System.out.println(o.oPrice); 
			
		}
		else
		{
			System.out.println("invalid");
		}
		
	}
}
