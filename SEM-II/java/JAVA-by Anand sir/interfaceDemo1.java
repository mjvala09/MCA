// Interface
interface MyInterface1{
	int i = 10;
	void display1();
}

interface MyInterface2 extends MyInterface1{
	void display2();
}

class interfaceDemo1 implements MyInterface2{
	public void display1(){
			System.out.println("Interface1 Demo");
	}
	public void display2(){
			System.out.println("Interface2 Demo");
	}
	public static void main(String[] args) {
		/*interfaceDemo1 inter1 = new interfaceDemo1();
		inter1.display1();*/
		interfaceDemo1 inter2 = new interfaceDemo1();
		inter2.display1();
		inter2.display2();
	}
}
