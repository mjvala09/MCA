class A{
	final int i = 100;
}
class B extends A{
	int i = 200; // shadow variable
}
class VariableShadowing{
	public static void main(String[] args) {
		B b = new B();
		A a = new A();
		System.out.println(a.i);
		System.out.println(b.i);
	}
}