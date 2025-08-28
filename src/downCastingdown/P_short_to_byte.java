package downCastingdown;

public class P_short_to_byte {
	 public static void main(String[] args) {
	        short s = 130;
	        byte b = (byte) s;   // data loss
	        System.out.println("Short value: " + s);
	        System.out.println("Byte value: " + b);
	    }
}
