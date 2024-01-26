// Inner Class
class Test{
	private int i = 100;
	class A{ // Inner Class
		int i = 200;
		public void display(){
			int i = 300;
			System.out.println(i);
			System.out.println(this.i);
			System.out.println(Test.this.i);
		}
	}
}
class InnerClass{
	public static void main(String[] args) {
		Test t = new Test();
		Test.A InnerObj = t.new A();
		InnerObj.display();
	}
}