package typecastingInJava;

public class TypeCastingConcept {
	
	public static void main(String[] args) {
		
		//up-casting automatic- smaller to larger
		int value1=100;
		long value2=value1;
		System.out.println(value2);
		
		System.out.println("*************************************");
		
		float f=10.5f;
		double d=f;
		System.out.println(d);
		System.out.println("*************************************");
		
		
		//down-casting Manually- larger to smaller 
		long l=234567;
		int i=(int) l; //down-casting
		System.out.println(i);
		System.out.println("*************************************");
		
		double d1=2323.213;
		float f1=(float) d1;
		System.out.println(f1);
		System.out.println("*************************************");
		
		//ex1
		double d2=10.5;
		int i1=(int) d2;
		System.out.println(i1);
		
		
	}
}
