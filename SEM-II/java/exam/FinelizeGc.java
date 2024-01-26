class FinelizeGc{
	public void finalize(){
		System.out.println("finelize");
		System.out.println("start");
	}
	public static void main(String[] args){
		FinelizeGc f1 = new FinelizeGc();
		FinelizeGc f2 = new FinelizeGc();
		// f1.finelize();
		f1 = f2;
		f2 = null;
		// new FinelizeGc();
		System.gc();

	}
}