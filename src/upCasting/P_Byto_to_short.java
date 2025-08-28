package upCasting;

public class P_Byto_to_short {
	public static void main(String[] args) {
		byte b=10;
		short sh=b; // automatic widening
		
		System.out.println(b);
		System.out.println(sh);
	}
}
