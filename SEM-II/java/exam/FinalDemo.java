class FinalClass{
	final int i = 10;
	final void finalMethod(){
		System.out.println("final method");
	}
}
class FinalDemo extends FinalClass{
	// public void finalMethod(){
	// 	System.out.println("final main");
	// }
	public static void main(String[] args) {
		FinalClass f1 = new FinalClass();
		// FinalDemo d1 = new FinalDemo();
		// d1.finalMethod();
		f1.finalMethod();
	}
}