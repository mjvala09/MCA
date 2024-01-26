class ExceptionDemo1{
	public static void main(String[] args) {
		int a = 0;
		int b = 20;

		try{
			System.out.println(a/b);
		}catch(ArithmeticException ae){
			System.out.println("Can not Divide by Zero");
		}
	}
}