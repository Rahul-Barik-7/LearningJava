package downCastingdown;

public class P_long_to_int {
	public static void main(String[] args) {
		 long l = 100000L;
	     int i = (int) l;   // explicit narrowing
	     System.out.println("Long value: " + l);
	     System.out.println("Int value: " + i);
	}
}
