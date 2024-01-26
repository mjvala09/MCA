// Simple,Single inheritance
class Parent{ // Super Class, Parent Class
	String ParentName = "Atmiya";
	int ParentAge = 20;
}
class Child extends Parent{ // Sub Class, Child Class
	Child(){
		System.out.println("Child Constructor");
	}
	String ChildName = "MCA";
	int ChildAge = 10;
	void PrintName(){
		System.out.println(ChildName);
	}
}
class SingleInheritance{
	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println(c1.ParentName);
		System.out.println(c1.ParentAge);
		c1.PrintName();
		System.out.println(c1.ChildName);
		System.out.println(c1.ChildAge);
	}
}