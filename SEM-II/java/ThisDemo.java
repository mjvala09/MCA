class Student1{
	int id;
	String name;
	Student1(){
		System.out.println("Default Constructer !!!");
	}
	Student1(int id, String name){
		this.id = id;
		this.name = name; 
	}
	void printIdName(){
		System.out.println(id + name);
	}
}
class ThisDemo{
	public static void main(String[] args) {
			Student1 s2 = new Student1();
			Student1 s1 = new Student1(111,"manoj");
			s2.printIdName();	// 0null
			s1.printIdName();	// 111manoj
		}	
}