// method overriding
// sub class have same method as in parent.
	// we must have to create object of parent.
	// otherwise we can not access parent class.
	// it makes specific implementation of class.
class ParentClass{
	void greetings(){
		System.out.println("Your are in Parent Class' method");
	}
}
class ChildClass extends ParentClass{
	void greetings(){
		System.out.println("Your are in Child Class' method");
	}
}
class MethodOverriding{
	public static void main(String[] args) {
		ParentClass p1 = new ParentClass();
		ParentClass c1 = new ChildClass();
		c1.greetings();
		p1.greetings();
	}
}