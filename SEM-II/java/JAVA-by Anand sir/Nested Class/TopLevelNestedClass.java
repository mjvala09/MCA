// Top-Level Nested Class
class Test{
	private static int x = 10;
	static class A{
		private static int y = 20;
		public static int getZ(){
			return B.z+x;
		}
	}
	static class B{
		private static int z = 30;
		public static int gety(){
			return A.y;
		}	
	}
}
class TopLevelNestedClass{
	public static void main(String[] args) {
		//Test t = new Test();
		System.out.println(Test.A.getZ());
		System.out.println(Test.B.gety());
	}
}