import java.util.Scanner;
class UserInputByScanner{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter name : ");
		String name = s.nextLine();
		System.out.println("your name : "+ name);

		System.out.print("what is your age : ");
		int age = s.nextInt();
		System.out.println(name+"  "+age);
	}
}