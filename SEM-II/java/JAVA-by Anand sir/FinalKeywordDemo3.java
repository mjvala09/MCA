// Final Variable and Method
final class A{
	final int i = 100;
	final void finalMethod(){
		System.out.println("Final Method : Class A");
	}
}
class B extends A{
	/*void finalMethod(){
		System.out.println("Final Method : Class B");		
	}*/
}

class FinalKeywordDemo3{
	public static void main(String[] args) {
		/*A a = new A();
		a.i = 200;
		System.out.println(a.i);*/
		B b = new B();
		b.finalMethod();
	}
}