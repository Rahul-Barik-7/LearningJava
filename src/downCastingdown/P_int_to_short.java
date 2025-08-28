package downCastingdown;

public class P_int_to_short {
	public static void main(String[] args) {
        int i = 32770;
        short s = (short) i;   // data loss
        System.out.println("Int value: " + i);
        System.out.println("Short value: " + s);
    }
}
