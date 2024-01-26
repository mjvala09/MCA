import java.util.Scanner;
class UserInput{
	public static void main(String[] args) {
		Scanner s = Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name = s.nextLine();
		
		System.out.print("Enter enroll number : ");
		String roll = s.nextInt();

		
		System.out.println(roll +"  "+ name);
	}
}