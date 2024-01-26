abstract class ParentClass{
	void greetings(){
		System.out.println("hello");
	}
	abstract String hello();
}
class ChildClass1 extends ParentClass{
	String hello(){
		System.out.println("kem cho ? majama!");
		return "majama"; 
	}
}
class ChildClass2 extends ParentClass{
	String hello(){
		System.out.println("how are you ? ");
		return "fine"; 
	}
}
class AbstractClass{
	public static void main(String[] args) {
		// ParentClass p1 = new ParentClass();		
			// ParentClass is abstract; cannot be instantiated
		ParentClass p1 = new ChildClass1();
		p1.greetings();
		String answer = p1.hello();
		System.out.println(answer);
		System.out.println();
		p1 = new ChildClass2();
		p1.greetings();
		answer = p1.hello();
		System.out.println(answer);		
	}
}
