// Hierarchical inheritance
class Ram{ // Parent Class, Super Class
	String parentName = "Atmiya University";
	int parentAge = 20;
	void ParentPrintName(){
		System.out.println(parentName);
	}
}
class Luv extends Ram{ // Sub Class, Child Class
	String childName = "MCA";
	int childAge = 10;
	void ChildPrintName(){
		System.out.println(childName);
	}
}
class Kush extends Ram{ // Sub Class, Child Class
	String childName = "MCA";
	int childAge = 10;
	void ChildPrintName(){
		System.out.println(childName);
	}
}
class HierarchicalInheritance{
	public static void main(String[] args) {
		Luv l = new Luv();
		Kush k = new Kush();
		l.ParentPrintName();
		k.ParentPrintName();
	}
}