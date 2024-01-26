class VarArgdemo1{

	void display(Object... oa){
		System.out.println("Var Arg Calls");

		for(Object o : oa){
			System.out.println(o + "\t");			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		VarArgdemo1 va1 = new VarArgdemo1();
		va1.display();
		va1.display(10);
		va1.display(10,20);
		va1.display(10,20,"Atmiya");
	}
}