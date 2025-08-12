package typecastingInJava;

public class TypeCastingObjects2 {
	
	public static void main(String[] args) {
		
//		Ex1
//		Object o=new String("Welcome");
//		StringBuffer sb=(StringBuffer) o; //r1-yes,r2-yes,r3-no(bcz there is no relation between string and stringBuffer)
		
//		Ex2
//		String s=new String();
//		StringBuffer sb=(String)s; //r1-no
		
//		Ex3
//		Object o=new String("Welcome");
//		StringBuffer sb=(StringBuffer) o; //r1-yes,r2-yes,r3-no
		
//		Ex4
//		Object o=new String("Welcome");
//		StringBuffer sb=(String) o; //r1-yes,r2-no
		
//		Ex5
//		String s=new String("Welcome");
//		StringBuffer sb=(String)s; //r1-no
		
//		Ex6
//		Object o=new String("Welcome");
//		StringBuffer sb=(StringBuffer)o; //r1-yes,r2-yes,r3-no
		
//		Ex7
		Object o=new String("Welcome");
		String s=(String)o; //r1-yes,r2-yes,r3-yes
		System.out.println(s);
	}
}
