class ParentClass{
	String faculty="Computer Science";
}
class ChildClass extends ParentClass{
	String department="MCA";
}
class SingleInheritence{
	public static void main(String[] args) {
		ChildClass c1 = new ChildClass();
		System.out.println(c1.faculty);
		System.out.println(c1.department);
	}
}