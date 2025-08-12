package typecastingInJava;

class Animal{}
class Dog extends Animal{}
  class Cat extends Animal{}
// A      b    C       d

public class TypeCastingsObjects {
	
	public static void main(String[] args) {
		
//		Rule-1(conversion is correct or not)-------------------
//		The type of 'an' and 'ct' must have some relationship (either P-C or C-P)
//		Animal an=new Dog();
//		Cat ct=(Cat) an; //valid as per rule-1
		
//		Dog dg=new Dog();
//		Cat ct1=(Cat)dg; //invalid as per rule-1
		
		
//		Rule-2(Assignment is valid or not)-------------------
//		'C' must be either same or child of 'A'=
//		Animal an=new Dog();
//		Cat ct=(Cat) an; //valid as per rule-2
//		ex-----2
//		Animal an=new Dog();
//		Cat ct=(Dog)an; //invalid as per rule-2
		
//		Rule-3(The underlying object type of 'd' must be either same or child of 'c')-------------------
//		'C' must be either same or child of 'A'=
//		Animal an=new Dog();
//		Cat ct=(Cat) an; //invalid as per rule-3
		
//		combining all 3 rules
		Animal an=new Dog();
		Dog dg=(Dog) an; //r1-yes,r2-yes,r3-yes
		
	}
}
