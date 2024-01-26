class ClassName{
	public static int a=10;
	// the variable said to be static, it can be accessed using 
	// [ classname.variable ]
}
class Static1{
	public static void main(String[] args) {
		System.out.println("Static "+ ClassName.a);
	}
}