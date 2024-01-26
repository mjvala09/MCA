// Hierarchical inheritance
class Parent1{ // Parent Class, Super Class
	String parent1Name = "Atmiya University";
	int parent1Age = 20;
	void Parent1PrintName(){
		System.out.println(parent1Name);
	}
}
class Parent2{ // Sub Class, Child Class
	String parent2Name = "Atmiya University";
	int parent2Age = 20;
	void Parent2PrintName(){
		System.out.println(parent2Name);
	}
}
class Child extends Parent1, Parent2{ // Sub Class, Child Class
	String childName = "MCA";
	int childAge = 10;
	void ChildPrintName(){
		System.out.println(childName);
	}
}
class MultiPleInheritance_NotPossible{
	public static void main(String[] args) {
		Child c = new Child();
		c.Parent1PrintName();
		c.Parent2PrintName();
	}
}