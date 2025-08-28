package downCastingdown;

public class P_float_to_long {
	public static void main(String[] args) {
		float f=123.45f;
		long l=(long)f; // explicit narrowing
		
		System.out.println(l);
	}
}
