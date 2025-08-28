package downCastingdown;

public class P_double_to_float {
	
	public static void main(String[] args) {
		double d=99.99;
		float f=(float) d; // explicit narrowing
		
		System.out.println(d);
		System.out.println(f);
	}
}
