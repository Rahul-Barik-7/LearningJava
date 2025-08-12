package encap;

public class Access {
	
	public static void main(String[] args) {
		
		Data d=new Data("Nadim", 10);
		System.out.println("Default Name: "+d.getName());
		
		d.setName("Dev");
		System.out.println("Updated Name: "+d.getName());
		
		System.out.println("Default age: "+d.getAge());
		
		d.setAge(50);
		System.out.println("Updated age: "+d.getAge());
		
	}
}
