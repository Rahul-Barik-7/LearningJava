package downCastingdown;

public class AnimalMain {
	public static void main(String[] args) {
		Animal an=new Dog();
		Dog d=(Dog)an;
		
		d.sound();
		d.bark();
	}
}
