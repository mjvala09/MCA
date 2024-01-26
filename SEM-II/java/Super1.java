// method overloading
// super keyword
class Super2{
	int i = 10;
	Super2(){
		System.out.println("Default constructor");
	}
	Super2(int i){
		System.out.println("Perameterized constructor");
	}
	void hello(){
		System.out.println("hello from superclass");
	}
}
class Super3 extends Super2{
	Super3(){
		// when we use the super keyword
		// for calling super class' constructor 
		// we must call from beggining of constructor.
		super(100);
		System.out.println(super.i);
	}
	int i = 20;
	void hello(){
		super.hello();
		System.out.println("i = "+ super.i);
		System.out.println("hello from subclass");
		System.out.println("i = "+ i);
	}
}
class Super1{
	public static void main(String[] args) {
		Super3 s3 = new Super3();
		s3.hello();
	}
}