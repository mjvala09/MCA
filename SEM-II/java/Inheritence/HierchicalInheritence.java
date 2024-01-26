class ParentClass{
	String faculty="MCA";
}
class ChildClass1 extends ParentClass{
	String division="B1";
}
class ChildClass2 extends ParentClass{
	String division="B2";
}
class HierchicalInheritence{
	public static void main(String[] args) {
		ChildClass1 c1 = new ChildClass1();
		System.out.println("FACULTY		: "+c1.faculty);
		System.out.println("DIVISION 	: "+c1.division);
		
		ChildClass2 c2 = new ChildClass2();
		System.out.println("FACULTY		: "+c1.faculty);
		System.out.println("DIVISION 	: "+c1.division);
	}
}