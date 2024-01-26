import java.util.Comparator;
class Student implements Comparable, Comparator{
	int marks;
	Student(){

	}
	Student(int marks){
		this.marks = marks;
	}
	public boolean equals(Object o){
		if(!(o instanceof Student))
			return false;
		if(this.marks != ((Student)o).marks){
			return false;
		}
		return true;
	}
	public int compareTo(Object o){
		return this.marks - ((Student)o).marks; // Casting to Object to Student
	}
	public int compare(Object o1, Object o2){
		return ((Student)o1).marks - ((Student)o2).marks;
	}
}
class StudentDemo{
	public static void main(String[] args) {
		int i = 120, j = 120;
		System.out.println(i == j);

		Student Raam = new Student(150);
		Student Laxman = new Student(160);

		System.out.println(Raam == Laxman);
		System.out.println(Raam.equals(Laxman));		
		System.out.println(Raam.compareTo(Laxman));
		System.out.println(Laxman.compareTo(Raam));

		Student Bharat = new Student();
		System.out.println(Bharat.compare(Raam, Laxman));
	}
}