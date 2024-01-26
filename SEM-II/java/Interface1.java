interface myinterface1{
	public int a = 10;
}
interface myinterface2{
	public int b = 20;
}

class Interface1 implements myinterface1, myinterface2{
	myinterface1 i1 = new myinterface1();
	System.out.println(a+b);
}