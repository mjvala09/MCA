class Simple{
	public void finelize(){
		System.out.println("finelize method the garbage collector");
	}
}
class GarbageCollection{
	public static void main(String[] args) {
		Simple g1 = new Simple();
		Simple g2 = new Simple();
		// g1.finelize();
		g1 = null;
		g2 = null;
		System.gc();
	}
}