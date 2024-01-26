import java.util.Scanner;
class Employees{
	String Name;
	int Empno;
	int Age;
}
class NewOperator{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		Employees Emp = new Employees();
		
		System.out.print("name : ");
		Emp.Name = s.nextLine();
		
		System.out.print("empno : ");
		Emp.Empno = s.nextInt();
		
		System.out.print("age : ");
		Emp.Age = s.nextInt();

		// Emp.Empno = 111;
		// Emp.Name = "michael";
		// Emp.Age = 24;

		System.out.print(Emp.Empno + Emp.Name + Emp.Age);
	}
}