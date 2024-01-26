class GrandParentClass{
	String faculty="Computer Science";
}
class ParentClass extends GrandParentClass{
	String department="MCA";
}
class Childclass extends ParentClass{
	String subDepartment="BCA";
}
class MultilevelInheritence{
	public static void main(String[] args) {
		Childclass c1 = new Childclass();
		System.out.println(c1.faculty);
		System.out.println(c1.department);
		System.out.println(c1.subDepartment);
	}
}