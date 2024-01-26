// Final Variable
class A{
	final int i = 100;
}
class FinalKeywordDemo1{
	public static void main(String[] args) {
		A a = new A();
		// a.i = 200;	//error: cannot assign a value to final variable i
		System.out.println(a.i);
	}
}