import java.util.Scanner;
class CalculateSI{	//	SI = (PRN/100)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		float SI, P, R;
		int N;
		System.out.print("Enter Principal amount : ");
		P = s.nextFloat();
		System.out.print("Enter Rate of Inerest : ");
		R = s.nextFloat();
		System.out.print("Enter No of years : ");
		N = s.nextInt();

		SI = (P*R*N)/100;
		System.out.println("Simple Interest : "+SI);
	}
}