// MultiLevel inheritance
class GrandParent{ // Super Class, Parent Class
	String grandParentName = "Sarvoday Kelavani samaj";
	int grandParentAge = 50;
	void GrandParentPrintName(){
		System.out.println(grandParentName);
	}
}
class Parent extends GrandParent{ // Sub Class, Child Class
	String parentName = "Atmiya University";
	int parentAge = 20;
	void ParentPrintName(){
		System.out.println(parentName);
	}
}
class Child extends Parent{
	String childName = "MCA";
	int childAge = 10;
	void ChildPrintName(){
		System.out.println(childName);
	}
}
class MultiLevelInheritance{
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.GrandParentPrintName();
		c1.ParentPrintName();
		c1.ChildPrintName();
	}
}