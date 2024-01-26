/*
Execution is something like this indices
	1) static block
	2) initializer block
	3) constructer
*/
class  Initializer1{
	Initializer1(){
		System.out.println("this is the constructer");
	}
//______________________________________________________________

	{	// it will call when object is created
		// when we created a new object it automatically call it
		System.out.println("Empty Block!!!");
	}
//______________________________________________________________
	
	static{		// it doesn't need to create object.
				// it will call automatic.
				// this will called only one time when class is loaded.
		System.out.println("Static Block!!!");
	}
//______________________________________________________________

	public static void main(String[] args) {
		 Initializer1 init1 = new Initializer1();
		 Initializer1 init2 = new Initializer1();
		 Initializer1 init3 = new Initializer1();
	}
}